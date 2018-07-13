package com.taotao.portal.controller;

import com.taotao.pojo.TbItem;
import com.taotao.portal.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**

 *@描述 展示商品详情页面

 *@参数

 *@返回值

 *@创建人  姜明仁

 *@创建时间  18/7/13


 */
@Controller
public class ItemController {
    @Autowired
    private ItemService itemService;

    @RequestMapping("/item/{itemId}")
    public String showItemInfo(@PathVariable long itemId, Model model){
        TbItem item = itemService.getItemById(itemId);
        model.addAttribute("item",item);
        return "item";
    }

    @RequestMapping(value = "/item/desc/{itemId}",produces = MediaType.TEXT_HTML_VALUE+";charset=utf-8")
    @ResponseBody
    public String getItemDescById(@PathVariable long itemId, HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            System.out.println("+++++++++++"+cookie.getName()+"========="+cookie.getValue());

        }
        String descById = itemService.getItemDescById(itemId);
        return descById;
    }


    @RequestMapping(value="/item/param/{itemId}",produces = MediaType.TEXT_HTML_VALUE+";charset=utf-8")
    @ResponseBody
    public String getItemParam(@PathVariable long itemId){
        String itemParam = itemService.getItemParam(itemId);
        return itemParam;
    }
}
