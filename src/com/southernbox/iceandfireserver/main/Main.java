package com.southernbox.iceandfireserver.main;

import com.google.gson.Gson;
import com.southernbox.iceandfireserver.entity.ContentDTO;
import com.southernbox.iceandfireserver.entity.TabDTO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by SouthernBox on 2017/2/19.
 * 生产json文件主类
 */
public class Main {

    private static List<TabDTO> tabList = new ArrayList<>();
    private static List<ContentDTO> contentList = new ArrayList<>();

    public static void main(String[] args) {
        tab2Json();
        content2Json();
    }

    private static void tab2Json() {
        initTabData();
        Gson gson = new Gson();
        String jsonString = gson.toJson(tabList);
        File optionJsonFile = new File("../IceAndFireServer/tab.json");
        try {
            OutputStreamWriter osw = new OutputStreamWriter(
                    new FileOutputStream(optionJsonFile), "UTF-8");
            BufferedWriter bw = new BufferedWriter(osw);
            bw.write(jsonString, 0, jsonString.length());
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void content2Json() {
        initContentData();
        Gson gson = new Gson();
        String jsonString = gson.toJson(contentList);
        File optionJsonFile = new File("../IceAndFireServer/content.json");
        try {
            OutputStreamWriter osw = new OutputStreamWriter(
                    new FileOutputStream(optionJsonFile), "UTF-8");
            BufferedWriter bw = new BufferedWriter(osw);
            bw.write(jsonString, 0, jsonString.length());
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void initTabData() {
        //人物数据
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
        //家族数据
        tabList.add(new TabDTO(
                20100,
                "house",
                "",
                "北境"));
        tabList.add(new TabDTO(
                20200,
                "house",
                "",
                "塞外"));
        tabList.add(new TabDTO(
                20300,
                "house",
                "",
                "河间地"));
        tabList.add(new TabDTO(
                20400,
                "house",
                "",
                "谷地"));
        tabList.add(new TabDTO(
                20500,
                "house",
                "",
                "铁群岛"));
        tabList.add(new TabDTO(
                20600,
                "house",
                "",
                "西境"));
        tabList.add(new TabDTO(
                20700,
                "house",
                "",
                "河湾地"));
        tabList.add(new TabDTO(
                20800,
                "house",
                "",
                "风暴地"));
        tabList.add(new TabDTO(
                20900,
                "house",
                "",
                "多恩"));
        tabList.add(new TabDTO(
                21000,
                "house",
                "",
                "其他"));
        //历史数据
        tabList.add(new TabDTO(
                30100,
                "history",
                "",
                "古代历史"));
        tabList.add(new TabDTO(
                30200,
                "history",
                "",
                "坦格利安王朝"));
        tabList.add(new TabDTO(
                30300,
                "history",
                "",
                "拜拉席恩王朝"));
        //城堡数据
        tabList.add(new TabDTO(
                40100,
                "history",
                "",
                "北境"));
        tabList.add(new TabDTO(
                40200,
                "history",
                "",
                "塞外"));
        tabList.add(new TabDTO(
                40300,
                "history",
                "",
                "河间地"));
        tabList.add(new TabDTO(
                40400,
                "history",
                "",
                "谷地"));
        tabList.add(new TabDTO(
                40500,
                "history",
                "",
                "铁群岛"));
        tabList.add(new TabDTO(
                40600,
                "history",
                "",
                "西境"));
        tabList.add(new TabDTO(
                40700,
                "history",
                "",
                "河湾地"));
        tabList.add(new TabDTO(
                40800,
                "history",
                "",
                "风暴地"));
        tabList.add(new TabDTO(
                40900,
                "history",
                "",
                "多恩"));
        tabList.add(new TabDTO(
                41000,
                "history",
                "",
                "其他"));
    }

    private static void initContentData() {
        //人物-史塔克
        String starkUrl = "/person/Stark";
        contentList.add(new ContentDTO(
                "Eddard_Stark",
                "person",
                "Stark",
                starkUrl + "/Eddard_Stark/Eddard_Stark.png",
                "艾德·史塔克",
                "临冬城公爵、北境守护",
                starkUrl + "/Eddard_Stark/Eddard_Stark.html"));
        contentList.add(new ContentDTO(
                "Catelyn_Tully",
                "person",
                "Stark",
                "/person/Tully/Catelyn_Tully/Catelyn_Tully.png",
                "凯特琳·徒利",
                "临冬城夫人、“猫姨”",
                "/person/Tully/Catelyn_Tully/Catelyn_Tully.html"));
        contentList.add(new ContentDTO(
                "Robb_Stark",
                "person",
                "Stark",
                starkUrl + "/Robb_Stark/Robb_Stark.png",
                "罗伯·史塔克",
                "临冬城继承人、“少狼主”",
                starkUrl + "/Robb_Stark/Robb_Stark.html"));
        contentList.add(new ContentDTO(
                "Jon_Snow",
                "person",
                "Stark",
                starkUrl + "/Jon_Snow/Jon_Snow.png",
                "琼恩·雪诺",
                "“临冬城的私生子“、“囧雪”",
                starkUrl + "/Jon_Snow/Jon_Snow.html"));
        contentList.add(new ContentDTO(
                "Sansa_Stark",
                "person",
                "Stark",
                starkUrl + "/Sansa_Stark/Sansa_Stark.png",
                "珊莎·史塔克",
                "“三傻”",
                starkUrl + "/Sansa_Stark/Sansa_Stark.html"));
        contentList.add(new ContentDTO(
                "Arya_Stark",
                "person",
                "Stark",
                starkUrl + "/Arya_Stark/Arya_Stark.png",
                "艾莉亚·史塔克",
                "“二丫”",
                starkUrl + "/Arya_Stark/Arya_Stark.html"));
        contentList.add(new ContentDTO(
                "Brandon_Stark",
                "person",
                "Stark",
                starkUrl + "/Brandon_Stark/Brandon_Stark.png",
                "布兰登·史塔克",
                "“布兰”",
                starkUrl + "/Brandon_Stark/Brandon_Stark.html"));
        contentList.add(new ContentDTO(
                "Rickon_Stark",
                "person",
                "Stark",
                starkUrl + "/Rickon_Stark/Rickon_Stark.png",
                "瑞肯·史塔克",
                "“核桃大帝”",
                starkUrl + "/Rickon_Stark/Rickon_Stark.html"));
        //人物-徒利
        String tullyUrl = "/person/Tully";
        contentList.add(new ContentDTO(
                "Catelyn_Tully",
                "person",
                "Tully",
                tullyUrl + "/Catelyn_Tully/Catelyn_Tully.png",
                "凯特琳·徒利",
                "临冬城夫人",
                tullyUrl + "/Catelyn_Tully/Catelyn_Tully.html"));
        //人物-兰尼斯特
        String lannisterUrl = "/person/Lannister";
        contentList.add(new ContentDTO(
                "Tywin_Lannister",
                "person",
                "Lannister",
                lannisterUrl + "/Tywin_Lannister/Tywin_Lannister.png",
                "泰温·兰尼斯特",
                "凯岩城公爵、兰尼斯港之盾、西境守护",
                lannisterUrl + "/Tywin_Lannister/Tywin_Lannister.html"));
    }

}
