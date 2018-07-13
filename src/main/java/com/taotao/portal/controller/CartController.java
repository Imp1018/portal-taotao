package com.taotao.portal.controller;

import com.taotao.portal.commons.TaotaoResult;
import com.taotao.portal.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class CartController {
    @Autowired
    private CartService cartService;
    @RequestMapping("/cart/add/{itemId}")
    public String addCart(@PathVariable long itemId, Integer num, HttpServletRequest request, HttpServletResponse response){

        TaotaoResult Result = cartService.addCart(itemId, num, request, response);
        return "cartSuccess";
    }
}
