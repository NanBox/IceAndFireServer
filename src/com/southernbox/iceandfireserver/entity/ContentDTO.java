package com.southernbox.iceandfireserver.entity;

/**
 * Created by SouthernBox on 2017/2/19.
 * 内容
 */
public class ContentDTO {

    private String id;
    private String firstType;
    private String secondType;
    private String img;
    private String name;
    private String intro;
    private String html;

    public ContentDTO(String id, String firstType, String secondType, String img, String name,
                      String intro, String html) {
        this.id = id;
        this.firstType = firstType;
        this.secondType = secondType;
        this.img = img;
        this.name = name;
        this.intro = intro;
        this.html = html;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstType() {
        return firstType;
    }

    public void setFirstType(String firstType) {
        this.firstType = firstType;
    }

    public String getSecondType() {
        return secondType;
    }

    public void setSecondType(String secondType) {
        this.secondType = secondType;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }
}
