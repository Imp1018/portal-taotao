package com.taotao.portal.pojo;

public class AdNode {
    private int height;
    private int width;
    private String src;
    private int heightB;
    private int widthB;
    private String srcB;
    private String alt;

    public int getHeight() {
        return height;
    }

    public AdNode setHeight(int height) {
        this.height = height;
        return this;
    }

    public int getWidth() {
        return width;
    }

    public AdNode setWidth(int width) {
        this.width = width;
        return this;
    }

    public String getSrc() {
        return src;
    }

    public AdNode setSrc(String src) {
        this.src = src;
        return this;
    }

    public int getHeightB() {
        return heightB;
    }

    public AdNode setHeightB(int heightB) {
        this.heightB = heightB;
        return this;
    }

    public int getWidthB() {
        return widthB;
    }

    public AdNode setWidthB(int widthB) {
        this.widthB = widthB;
        return this;
    }

    public String getSrcB() {
        return srcB;
    }

    public AdNode setSrcB(String srcB) {
        this.srcB = srcB;
        return this;
    }

    public String getAlt() {
        return alt;
    }

    public AdNode setAlt(String alt) {
        this.alt = alt;
        return this;
    }

    public String getHref() {
        return href;
    }

    public AdNode setHref(String href) {
        this.href = href;
        return this;
    }

    private String href;
}
