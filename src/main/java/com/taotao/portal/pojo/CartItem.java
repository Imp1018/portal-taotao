package com.taotao.portal.pojo;


public class CartItem {
    private long id;
    private String title;
    private Integer num;
    private long price;
    private String image;

    public long getId() {
        return id;
    }

    public CartItem setId(long id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public CartItem setTitle(String title) {
        this.title = title;
        return this;
    }

    public Integer getNum() {
        return num;
    }

    public CartItem setNum(Integer num) {
        this.num = num;
        return this;
    }

    public long getPrice() {
        return price;
    }

    public CartItem setPrice(long price) {
        this.price = price;
        return this;
    }

    public String getImage() {
        return image;
    }

    public CartItem setImage(String image) {
        this.image = image;
        return this;
    }


}

