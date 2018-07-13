package com.taotao.portal.pojo;


public class SearchItem {
    private String id;
    private String title;
    private String sell_point;
    private long price;
    private String image;
    private String category_name;

    public String getId() {
        return id;
    }

    public SearchItem setId(String id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public SearchItem setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getSell_point() {
        return sell_point;
    }

    public SearchItem setSell_point(String sell_point) {
        this.sell_point = sell_point;
        return this;
    }

    public long getPrice() {
        return price;
    }

    public SearchItem setPrice(long price) {
        this.price = price;
        return this;
    }

    public String getImage() {
        if (image != null && image.equals("")) {
            String[] strings = image.split(",");
            return strings[0];
        }
        return image;
    }

    public SearchItem setImage(String image) {
        this.image = image;
        return this;
    }

    public String getCategory_name() {
        return category_name;
    }

    public SearchItem setCategory_name(String category_name) {
        this.category_name = category_name;
        return this;
    }
}
