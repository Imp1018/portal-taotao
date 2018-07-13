package com.taotao.portal.service.impl;

import com.taotao.pojo.TbItem;
import com.taotao.portal.commons.CookieUtils;
import com.taotao.portal.commons.JsonUtils;
import com.taotao.portal.commons.TaotaoResult;
import com.taotao.portal.pojo.CartItem;
import com.taotao.portal.service.CartService;
import com.taotao.portal.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private ItemService itemService;

    @Override
    public TaotaoResult addCart(long itemId, Integer num, HttpServletRequest request, HttpServletResponse response) {
        //从cookie中取购物车商品列表
        List<CartItem> itemList = getCartItemList(request);
        // 从商品列表中查询列表是否存在此商品
        boolean haveFlag = false;
        for (CartItem cartItem : itemList) {
            if (cartItem.getId() == itemId) {
                cartItem.setNum(cartItem.getNum() + num);
                haveFlag = true;
                break;
            }
        }

        if (!haveFlag) {
            TbItem item = itemService.getItemById(itemId);
            // 转换成cartitem
            CartItem cartItem = new CartItem();
            cartItem.setId(itemId);
            cartItem.setNum(num);
            cartItem.setPrice(item.getPrice());
            cartItem.setTitle(item.getTitle());
            if (item.getImage() != null) {
                String image = item.getImage();
                String[] strings = image.split(",");
                cartItem.setImage(strings[0]);
            }
           itemList.add(cartItem);
        }
            // 把购物车商品写入cookie
        CookieUtils.setCookie(request,response,"TT_CART",JsonUtils.objectToJson(itemList),true);
            // 返回taotaoResult

        return TaotaoResult.ok();
    }


    /**
     * @描述 取购物车商品列表
     * @参数
     * @返回值 java.util.List<com.taotao.portal.pojo.CartItem>
     * @创建人 姜明仁
     * @创建时间 18/7/13
     */
    private List<CartItem> getCartItemList(HttpServletRequest request) {

        try {
            //从cookie中取商品列表
            String json = CookieUtils.getCookieValue(request, "TT_CART", true);
            //转换成java对象
            List<CartItem> list = JsonUtils.jsonToList(json, CartItem.class);
            return list == null ? new ArrayList<CartItem>() : list;
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }
}
