package com.taotao.portal.service;

import com.taotao.portal.commons.TaotaoResult;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface CartService {
    TaotaoResult addCart(long itemId, Integer num, HttpServletRequest request, HttpServletResponse response);
}
