package com.taotao.portal.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


public class Item {
    private String id;
    private String title;
    private String sellPoint;
    private long price;
    private String image;
    private String categoryName;
    private String itemDesc;

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    public String getImage() {

        return image;
    }

    public String getSellPoint() {
        return sellPoint;
    }

    public void setSellPoint(String sellPoint) {
        this.sellPoint = sellPoint;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getId() {
        return id;
    }

    public Item setId(String id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Item setTitle(String title) {
        this.title = title;
        return this;
    }


    public long getPrice() {
        return price;
    }

    public Item setPrice(long price) {
        this.price = price;
        return this;
    }

    public String[] getImages() {
        if (image != null) {
            String[] images = image.split(",");
            return images;
        }
        return null;
    }

    public Item setImage(String image) {
        this.image = image;
        return this;
    }


}
