package com.southernbox.iceandfireserver.main;

import com.google.gson.Gson;
import com.southernbox.iceandfireserver.entity.ContentDTO;
import com.southernbox.iceandfireserver.entity.TabDTO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by SouthernBox on 2017/2/19.
 * 生产 json 文件
 */
public class Main {

    private static List<TabDTO> tabList = new ArrayList<>();
    private static List<ContentDTO> contentList = new ArrayList<>();

    public static void main(String[] args) {
        tab2Json();
        content2Json();
    }

    /**
     * 将 tab 数据转换为 json
     */
    private static void tab2Json() {
        initTabData();
        Gson gson = new Gson();
        String jsonString = gson.toJson(tabList);
        File tabJsonFile = new File("../IceAndFireServer/tab.json");
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
     * 将 content 数据转换为 json
     */
    private static void content2Json() {
        initContentData();
        Gson gson = new Gson();
        String jsonString = gson.toJson(contentList);
        File contentJsonFile = new File("../IceAndFireServer/content.json");
        try {
            OutputStreamWriter osw = new OutputStreamWriter(
                    new FileOutputStream(contentJsonFile), "UTF-8");
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
        tabList.add(new TabDTO(
                10100,
                "person",
                "Stark",
                "史塔克"));
        tabList.add(new TabDTO(
                10200,
                "person",
                "Lannister",
                "兰尼斯特"));
        tabList.add(new TabDTO(
                10300,
                "person",
                "Baratheon",
                "拜拉席恩"));
        tabList.add(new TabDTO(
                10400,
                "person",
                "Targaryen",
                "坦格利安"));
        tabList.add(new TabDTO(
                10500,
                "person",
                "Tully",
                "徒利"));
        tabList.add(new TabDTO(
                10600,
                "person",
                "Tyrell",
                "提利尔"));
        tabList.add(new TabDTO(
                10700,
                "person",
                "Arryn",
                "艾林"));
        tabList.add(new TabDTO(
                10800,
                "person",
                "Martell",
                "马泰尔"));
        tabList.add(new TabDTO(
                10900,
                "person",
                "Others",
                "其他"));
    }

    /**
     * 初始化家族 tab 数据
     */
    private static void initHouseTabData() {
        tabList.add(new TabDTO(
                20100,
                "house",
                "The_North",
                "北境"));
        tabList.add(new TabDTO(
                20200,
                "house",
                "Beyond_the_Wall",
                "塞外"));
        tabList.add(new TabDTO(
                20300,
                "house",
                "Riverlands",
                "河间地"));
        tabList.add(new TabDTO(
                20400,
                "house",
                "Vale",
                "谷地"));
        tabList.add(new TabDTO(
                20500,
                "house",
                "Iron_Islands",
                "铁群岛"));
        tabList.add(new TabDTO(
                20600,
                "house",
                "Westerlands",
                "西境"));
        tabList.add(new TabDTO(
                20700,
                "house",
                "Reach",
                "河湾地"));
        tabList.add(new TabDTO(
                20800,
                "house",
                "Stormlands",
                "风暴地"));
        tabList.add(new TabDTO(
                20900,
                "house",
                "Dorne",
                "多恩"));
        tabList.add(new TabDTO(
                21000,
                "house",
                "Others",
                "其他"));
    }

    /**
     * 初始化历史 tab 数据
     */
    private static void initHistoryTabData() {
        tabList.add(new TabDTO(
                30100,
                "history",
                "Ancient_History",
                "古代历史"));
        tabList.add(new TabDTO(
                30200,
                "history",
                "Targaryen_Dynasty",
                "坦格利安王朝"));
        tabList.add(new TabDTO(
                30300,
                "history",
                "Baratheon_Dynasty",
                "拜拉席恩王朝"));
    }

    /**
     * 初始化城堡 tab 数据
     */
    private static void initCastleTabData() {
        tabList.add(new TabDTO(
                40100,
                "castle",
                "The_North",
                "北境"));
        tabList.add(new TabDTO(
                40200,
                "castle",
                "Beyond_the_Wall",
                "塞外"));
        tabList.add(new TabDTO(
                40300,
                "castle",
                "Riverlands",
                "河间地"));
        tabList.add(new TabDTO(
                40400,
                "castle",
                "Vale",
                "谷地"));
        tabList.add(new TabDTO(
                40500,
                "castle",
                "Iron_Islands",
                "铁群岛"));
        tabList.add(new TabDTO(
                40600,
                "castle",
                "Westerlands",
                "西境"));
        tabList.add(new TabDTO(
                40700,
                "castle",
                "Reach",
                "河湾地"));
        tabList.add(new TabDTO(
                40800,
                "castle",
                "Stormlands",
                "风暴地"));
        tabList.add(new TabDTO(
                40900,
                "castle",
                "Dorne",
                "多恩"));
        tabList.add(new TabDTO(
                41000,
                "castle",
                "Others",
                "其他"));
    }

    /**
     * 初始化 Content 数据
     */
    private static void initContentData() {
        initPersonContentData();
        initHouseContentData();
    }

    /**
     * 初始化人物数据
     */
    private static void initPersonContentData() {
        initStarkPersonContentData();
        initLannisterPersonContentData();
        initBaratheonPersonContentData();
        initTullyPersonContentData();
    }

    private static void initHouseContentData() {
        initNorthHouseContentData();
        initWesterlandsHouseContentData();
    }

    /**
     * 初始化史塔克人物数据
     */
    private static void initStarkPersonContentData() {
        String starkUrl = "person/Stark/";
        contentList.add(new ContentDTO(
                "Eddard_Stark",
                "person",
                "Stark",
                starkUrl + "Eddard_Stark.png",
                "艾德·史塔克",
                "临冬城公爵、北境守护",
                starkUrl + "Eddard_Stark.html"));
        contentList.add(new ContentDTO(
                "Robb_Stark",
                "person",
                "Stark",
                starkUrl + "Robb_Stark.png",
                "罗伯·史塔克",
                "临冬城继承人、“少狼主”",
                starkUrl + "Robb_Stark.html"));
        contentList.add(new ContentDTO(
                "Jon_Snow",
                "person",
                "Stark",
                starkUrl + "Jon_Snow.png",
                "琼恩·雪诺",
                "“临冬城的私生子“、“囧雪”",
                starkUrl + "Jon_Snow.html"));
        contentList.add(new ContentDTO(
                "Sansa_Stark",
                "person",
                "Stark",
                starkUrl + "Sansa_Stark.png",
                "珊莎·史塔克",
                "“三傻”",
                starkUrl + "Sansa_Stark.html"));
        contentList.add(new ContentDTO(
                "Arya_Stark",
                "person",
                "Stark",
                starkUrl + "Arya_Stark.png",
                "艾莉亚·史塔克",
                "“二丫”",
                starkUrl + "Arya_Stark.html"));
        contentList.add(new ContentDTO(
                "Brandon_Stark",
                "person",
                "Stark",
                starkUrl + "Brandon_Stark.png",
                "布兰登·史塔克",
                "“布兰”",
                starkUrl + "Brandon_Stark.html"));
        contentList.add(new ContentDTO(
                "Rickon_Stark",
                "person",
                "Stark",
                starkUrl + "Rickon_Stark.png",
                "瑞肯·史塔克",
                "“核桃大帝”",
                starkUrl + "Rickon_Stark.html"));
    }

    /**
     * 初始化兰尼斯特人物数据
     */
    private static void initLannisterPersonContentData() {
        String lannisterUrl = "person/Lannister/";
        contentList.add(new ContentDTO(
                "Tywin_Lannister",
                "person",
                "Lannister",
                lannisterUrl + "Tywin_Lannister.png",
                "泰温·兰尼斯特",
                "凯岩城公爵、兰尼斯港之盾、西境守护",
                lannisterUrl + "Tywin_Lannister.html"));
        contentList.add(new ContentDTO(
                "Jaime_Lannister",
                "person",
                "Lannister",
                lannisterUrl + "Jaime_Lannister.png",
                "詹姆·兰尼斯特",
                "“弑君者”",
                lannisterUrl + "Jaime_Lannister.html"));
        contentList.add(new ContentDTO(
                "Cersei_Lannister",
                "person",
                "Lannister",
                lannisterUrl + "Cersei_Lannister.png",
                "瑟曦·兰尼斯特",
                "",
                lannisterUrl + "Cersei_Lannister.html"));
        contentList.add(new ContentDTO(
                "Tyrion_Lannister",
                "person",
                "Lannister",
                lannisterUrl + "Tyrion_Lannister.png",
                "提利昂·兰尼斯特",
                "“小恶魔”",
                lannisterUrl + "Tyrion_Lannister.html"));
        contentList.add(new ContentDTO(
                "Kevan_Lannister",
                "person",
                "Lannister",
                lannisterUrl + "Kevan_Lannister.png",
                "凯冯·兰尼斯特",
                "",
                lannisterUrl + "Kevan_Lannister.html"));
        contentList.add(new ContentDTO(
                "Lancel_Lannister",
                "person",
                "Lannister",
                lannisterUrl + "Lancel_Lannister.png",
                "蓝赛尔·兰尼斯特",
                "",
                lannisterUrl + "Lancel_Lannister.html"));
    }


    /**
     * 初始化拜拉席恩人物数据
     */
    private static void initBaratheonPersonContentData() {
        String baratheonUrl = "person/Baratheon/";
        contentList.add(new ContentDTO(
                "Robert_Baratheon",
                "person",
                "Baratheon",
                baratheonUrl + "Robert_Baratheon.png",
                "劳勃·拜拉席恩",
                "七国国王、全境守护、风息堡公爵",
                baratheonUrl + "Robert_Baratheon.html"));
        contentList.add(new ContentDTO(
                "Joffrey_Baratheon",
                "person",
                "Baratheon",
                baratheonUrl + "Joffrey_Baratheon.png",
                "乔佛里·拜拉席恩",
                "",
                baratheonUrl + "Joffrey_Baratheon.html"));
    }

    /**
     * 初始化徒利人物数据
     */
    private static void initTullyPersonContentData() {
        String tullyUrl = "person/Tully/";
        contentList.add(new ContentDTO(
                "Catelyn_Tully",
                "person",
                "Tully",
                tullyUrl + "Catelyn_Tully.png",
                "凯特琳·徒利",
                "临冬城夫人",
                tullyUrl + "Catelyn_Tully.html"));
    }

    /**
     * 初始化北境家族数据
     */
    private static void initNorthHouseContentData() {
        String northUrl = "house/The_North/";
        contentList.add(new ContentDTO(
                "House_Stark",
                "house",
                "The_North",
                northUrl + "House_Stark.png",
                "史塔克家族",
                "",
                northUrl + "House_Stark.html"));
    }

    /**
     * 初始化西境家族数据
     */
    private static void initWesterlandsHouseContentData() {
        String westerlandsUrl = "house/Westerlands/";
        contentList.add(new ContentDTO(
                "House_Lannister",
                "house",
                "Westerlands",
                westerlandsUrl + "House_Lannister.png",
                "兰尼斯特家族",
                "",
                westerlandsUrl + "House_Lannister.html"));
    }

}
