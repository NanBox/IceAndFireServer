package com.southernbox.iceandfireserver.entity;

/**
 * Created by SouthernBox on 2017/2/19.
 * TabLayout中的Tab项
 */
public class TabDTO {

    private int id;
    private String firstType;
    private String secondType;
    private String title;

    public TabDTO(int id, String firstType, String secondType, String title) {
        this.id = id;
        this.firstType = firstType;
        this.secondType = secondType;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
