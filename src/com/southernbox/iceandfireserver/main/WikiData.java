package com.southernbox.iceandfireserver.main;

import com.google.gson.Gson;
import com.southernbox.iceandfireserver.entity.WikiTab;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by SouthernBox on 2017/6/27 0027.
 * 生成维基分类数据
 */
public class WikiData {

    private static List<WikiTab> tabList = new ArrayList<>();

    public static void main(String[] args) {
        tab2Json();
    }

    /**
     * 将 tab 数据转换为 json
     */
    private static void tab2Json() {
        initTabData();
        Gson gson = new Gson();
        String jsonString = gson.toJson(tabList);
        File tabJsonFile = new File("../IceAndFireServer/WikiTab.json");
        try {
            OutputStreamWriter osw = new OutputStreamWriter(
                    new FileOutputStream(tabJsonFile), "UTF-8");
            BufferedWriter bw = new BufferedWriter(osw);
            bw.write(jsonString, 0, jsonString.length());
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 初始化 tab 数据
     */
    private static void initTabData() {
        initPersonTabData();
        initHouseTabData();
        initHistoryTabData();
        initCastleTabData();
    }

    /**
     * 初始化人物 tab 数据
     */
    private static void initPersonTabData() {
        tabList.add(new WikiTab(
                "person",
                "史塔克",
                "史塔克家族"));
        tabList.add(new WikiTab(
                "person",
                "兰尼斯特",
                "兰尼斯特家族"));
        tabList.add(new WikiTab(
                "person",
                "拜拉席恩",
                "拜拉席恩家族"));
        tabList.add(new WikiTab(
                "person",
                "坦格利安",
                "坦格利安家族"));
        tabList.add(new WikiTab(
                "person",
                "徒利",
                "徒利家族"));
        tabList.add(new WikiTab(
                "person",
                "佛雷",
                "佛雷家族"));
        tabList.add(new WikiTab(
                "person",
                "提利尔",
                "提利尔家族"));
        tabList.add(new WikiTab(
                "person",
                "艾林",
                "艾林家族"));
        tabList.add(new WikiTab(
                "person",
                "马泰尔",
                "马泰尔家族"));
        tabList.add(new WikiTab(
                "person",
                "葛雷乔伊",
                "葛雷乔伊家族"));
    }

    /**
     * 初始化家族 tab 数据
     */
    private static void initHouseTabData() {
        tabList.add(new WikiTab(
                "house",
                "贵族",
                "贵族家族"));
        tabList.add(new WikiTab(
                "house",
                "北境",
                "北境家族"));
        tabList.add(new WikiTab(
                "house",
                "西境",
                "西境家族"));
        tabList.add(new WikiTab(
                "house",
                "风暴地",
                "风暴地家族"));
        tabList.add(new WikiTab(
                "house",
                "河间地",
                "河间地家族"));
        tabList.add(new WikiTab(
                "house",
                "河湾地",
                "河湾地家族"));
        tabList.add(new WikiTab(
                "house",
                "谷地",
                "谷地家族"));
        tabList.add(new WikiTab(
                "house",
                "多恩",
                "多恩家族"));
        tabList.add(new WikiTab(
                "house",
                "铁群岛",
                "铁群岛家族"));
    }

    /**
     * 初始化历史 tab 数据
     */
    private static void initHistoryTabData() {
        tabList.add(new WikiTab(
                "history",
                "文化",
                "文化"));
        tabList.add(new WikiTab(
                "history",
                "事件",
                "事件"));
        tabList.add(new WikiTab(
                "history",
                "战争",
                "战争"));
        tabList.add(new WikiTab(
                "history",
                "战役",
                "战役"));
        tabList.add(new WikiTab(
                "history",
                "术语",
                "术语"));
        tabList.add(new WikiTab(
                "history",
                "理论推测",
                "理论推测"));
    }

    /**
     * 初始化地理 tab 数据
     */
    private static void initCastleTabData() {
        tabList.add(new WikiTab(
                "site",
                "王领",
                "王领地点"));
        tabList.add(new WikiTab(
                "site",
                "北境",
                "北境地点"));
        tabList.add(new WikiTab(
                "site",
                "西境",
                "西境地点"));
        tabList.add(new WikiTab(
                "site",
                "风暴地",
                "风暴地地点"));
        tabList.add(new WikiTab(
                "site",
                "河间地",
                "河间地地点"));
        tabList.add(new WikiTab(
                "site",
                "河湾地",
                "河湾地地点"));
        tabList.add(new WikiTab(
                "site",
                "谷地",
                "谷地地点"));
        tabList.add(new WikiTab(
                "site",
                "多恩",
                "多恩地点"));
        tabList.add(new WikiTab(
                "site",
                "铁群岛",
                "铁群岛地点"));
        tabList.add(new WikiTab(
                "site",
                "塞外",
                "塞外地点"));
        tabList.add(new WikiTab(
                "site",
                "厄斯索斯",
                "厄斯索斯地点"));
        tabList.add(new WikiTab(
                "site",
                "索斯罗斯",
                "索斯罗斯地点"));
    }

}
