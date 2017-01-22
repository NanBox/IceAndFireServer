package com.southernbox.iceandfireserver.object2json;

import com.google.gson.Gson;
import com.southernbox.iceandfireserver.entity.Content;
import com.southernbox.iceandfireserver.entity.ContentJson;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Content2Json {

    public static void main(String[] args) {
        initStark();
        initTully();
        initLannister();
    }

    private static void outPutJson(List<Content> list, String url) {
        ContentJson optionJson = new ContentJson(list);
        Gson gson = new Gson();
        String jsonString = gson.toJson(optionJson);
        File optionJsonFile = new File(url);
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

    private static void initStark() {
        List<Content> contentList = new ArrayList<>();
        String starkUrl = "/person/Stark";
        contentList.add(new Content(
                "Eddard_Stark",
                1,
                starkUrl + "/Eddard_Stark/Eddard_Stark.png",
                "艾德·史塔克",
                "临冬城公爵、北境守护",
                starkUrl + "/Eddard_Stark/Eddard_Stark.html"));
        contentList.add(new Content(
                "Catelyn_Tully",
                1,
                "/person/Tully/Catelyn_Tully/Catelyn_Tully.png",
                "凯特琳·徒利",
                "临冬城夫人、“猫姨”",
                "/person/Tully/Catelyn_Tully/Catelyn_Tully.html"));
        contentList.add(new Content(
                "Robb_Stark",
                1,
                starkUrl + "/Robb_Stark/Robb_Stark.png",
                "罗伯·史塔克",
                "临冬城继承人、“少狼主”",
                starkUrl + "/Robb_Stark/Robb_Stark.html"));
        contentList.add(new Content(
                "Jon_Snow",
                1,
                starkUrl + "/Jon_Snow/Jon_Snow.png",
                "琼恩·雪诺",
                "“临冬城的私生子“、“囧雪”",
                starkUrl + "/Jon_Snow/Jon_Snow.html"));
        contentList.add(new Content(
                "Sansa_Stark",
                1,
                starkUrl + "/Sansa_Stark/Sansa_Stark.png",
                "珊莎·史塔克",
                "“三傻”",
                starkUrl + "/Sansa_Stark/Sansa_Stark.html"));
        contentList.add(new Content(
                "Arya_Stark",
                1,
                starkUrl + "/Arya_Stark/Arya_Stark.png",
                "艾莉亚·史塔克",
                "“二丫”",
                starkUrl + "/Arya_Stark/Arya_Stark.html"));
        contentList.add(new Content(
                "Brandon_Stark",
                1,
                starkUrl + "/Brandon_Stark/Brandon_Stark.png",
                "布兰登·史塔克",
                "“布兰”",
                starkUrl + "/Brandon_Stark/Brandon_Stark.html"));
        contentList.add(new Content(
                "Rickon_Stark",
                1,
                starkUrl + "/Rickon_Stark/Rickon_Stark.png",
                "瑞肯·史塔克",
                "“核桃大帝”",
                starkUrl + "/Rickon_Stark/Rickon_Stark.html"));
        outPutJson(contentList, "../IceAndFireServer/person/Stark/Stark.json");
    }

    private static void initTully() {
        List<Content> contentList = new ArrayList<>();
        String tullyUrl = "/person/Tully";
        contentList.add(new Content(
                "Catelyn_Tully",
                1,
                tullyUrl + "/Catelyn_Tully/Catelyn_Tully.png",
                "凯特琳·徒利",
                "临冬城夫人",
                tullyUrl + "/Catelyn_Tully/Catelyn_Tully.html"));
        outPutJson(contentList, "../IceAndFireServer/person/Tully/Tully.json");
    }

    private static void initLannister() {
        List<Content> contentList = new ArrayList<>();
        String lannisterUrl = "/person/Tully";
        contentList.add(new Content(
                "Tywin_Lannister",
                1,
                lannisterUrl + "/Tywin_Lannister/Tywin_Lannister.png",
                "泰温·兰尼斯特",
                "凯岩城公爵、兰尼斯港之盾、西境守护",
                lannisterUrl + "/Tywin_Lannister/Tywin_Lannister.html"));
        outPutJson(contentList, "../IceAndFireServer/person/Lannister/Lannister.json");
    }
}
