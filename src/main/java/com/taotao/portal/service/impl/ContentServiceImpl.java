package com.taotao.portal.service.impl;

import com.taotao.portal.commons.HttpClientUtil;
import com.taotao.portal.commons.JsonUtils;
import com.taotao.portal.commons.TaotaoResult;
import com.taotao.portal.pojo.AdNode;
import com.taotao.portal.service.ContentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
//
//@Service
//public class ContentServiceImpl implements ContentService {
//    /**
//
//     *@描述 获得打广告位的内容
//
//     *@参数
//
//     *@返回值  java.lang.String
//
//     *@创建人  姜明仁
//
//     *@创建时间  18/7/12
//
//
//     */
//
//    @Value("${REST_BASE_URL}")
//    private String REST_BASE_URL;
//
//    @Value("{REST_CONTENT_URL}")
//    private String REST_CONTENT_URL;
//
//    @Value("{REST_CONTENT_AD1_CID}")
//    private String REST_CONTENT_AD1_CID;
//
//    @Override
//    public String getAd1List() {
        //调用服务获取数据
//        String json = HttpClientUtil.doGet(REST_BASE_URL + REST_CONTENT_URL + REST_CONTENT_AD1_CID);
//        // 把json转换成java对象
//        TaotaoResult.formatToList(json,TbContent.class);
//        // 去data属性,内容列表
//        List<TbContent>contentList=(List<TbContent>)taotaoresult.getData();
//        // 把内容列表转换成adnode列表
//        for (TbContent tbContent : contentList) {
//            AdNode adNode = new AdNode();
//            adNode.setHeight(240);
//            adNode.setWidth(670);
//            adNode.setSrc(tbContent.getPic());
//
//            adNode.setHeightB(240);
//            adNode.setWidthB(550);
//            adNode.setSrcB(tbContent.getPic2());
//
//            adNode.setAlt(tbContent.getSubTitle());
//            adNode.setHref(tbContent.getUrl());
//            resultList.add(adNode);
//        }
//        // 把resultList转换成json数据
//        String resultJson = JsonUtils.objectToJson(resultList);
//        return resultJson;
//  }
//}
