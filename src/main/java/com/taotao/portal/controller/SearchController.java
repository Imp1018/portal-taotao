package com.taotao.portal.controller;

import com.taotao.portal.pojo.SearchResult;
import com.taotao.portal.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.UnsupportedEncodingException;

@Controller
public class SearchController {
    @Autowired
    private SearchService searchService;

    @RequestMapping("/search")
    public String search(Model model,@RequestParam("q") String keyword, @RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "60") Integer rows ) {
            // get乱码处理
        try {
            keyword=new String(keyword.getBytes("iso8859-1"),"utf8");
        } catch (UnsupportedEncodingException e) {
            keyword="";
            e.printStackTrace();
        }
        SearchResult search = searchService.search(keyword, page,rows);
        if (search != null) {
            //参数传递给页面
            model.addAttribute("query", keyword);
            model.addAttribute("totalPages", search.getPageCount());
            model.addAttribute("itemList", search.getSearchItemList());
            model.addAttribute("page", search.getCurPage());

            //返回逻辑视图
            return "search";
        }
        return "search";

    }
}
