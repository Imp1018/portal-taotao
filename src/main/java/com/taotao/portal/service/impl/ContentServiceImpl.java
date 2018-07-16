package com.taotao.portal.service.impl;

import com.taotao.pojo.TbContent;
import com.taotao.portal.commons.HttpClientUtil;
import com.taotao.portal.commons.JsonUtils;
import com.taotao.portal.commons.TaotaoResult;
import com.taotao.portal.service.ContentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ContentServiceImpl implements ContentService {
    /**
     * @描述 获得打广告位的内容
     * @参数
     * @返回值 java.lang.String
     * @创建人 姜明仁
     * @创建时间 18/7/12
     */

    @Value("${REST_BASE_URL}")
    private String REST_BASE_URL;

    @Value("${REST_INDEX_AD_URL}")
    private String REST_INDEX_AD_URL;


    @Override
    public String getAd1List() {
        // 调用服务获取数据
        String json = HttpClientUtil.doGet(REST_BASE_URL + REST_INDEX_AD_URL);
        try {
            // 把json转换成java对象
            TaotaoResult taotaoResult = TaotaoResult.formatToList(json, TbContent.class);
            // 去data属性,内容列表
            List<TbContent> contentList = (List<TbContent>) taotaoResult.getData();
            // 把内容列表转换成adnode列表
            List<Map> resultList = new ArrayList<>();
            //创建一个jsp页码要求的pojo列表
            for (TbContent tbContent : contentList) {
                Map map = new HashMap<>();
                map.put("src", tbContent.getPic());
                map.put("height", 240);
                map.put("width", 670);
                map.put("srcB", tbContent.getPic2());
                map.put("widthB", 550);
                map.put("heightB", 240);
                map.put("href", tbContent.getUrl());
                map.put("alt", tbContent.getSubTitle());
                resultList.add(map);
            }
            return JsonUtils.objectToJson(resultList);
        } catch (Exception e)

        {
            e.printStackTrace();
        }

        return null;
    }
}
