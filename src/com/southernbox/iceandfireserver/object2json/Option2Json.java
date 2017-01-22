package com.southernbox.iceandfireserver.object2json;

import com.google.gson.Gson;
import com.southernbox.iceandfireserver.entity.Option;
import com.southernbox.iceandfireserver.entity.SecondOption;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Option2Json {
    private static List<SecondOption> familyList = new ArrayList<>();
    private static List<SecondOption> geographyList1 = new ArrayList<>();
    private static List<SecondOption> eraList = new ArrayList<>();
    private static List<SecondOption> geographyList2 = new ArrayList<>();
    private static List<Option> optionList = new ArrayList<>();

    public static void main(String[] args) {
        initFamily();
        initGeography1();
        initEra();
        initGeography2();
        initOption();
        Gson gson = new Gson();
        String jsonString = gson.toJson(optionList);
        File optionJsonFile = new File("../IceAndFireServer/option.json");
        //File optionJsonFile = new File("G:/apache-tomcat-6.0.29/webapps/IceAndFire/option.json");
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

    private static void initFamily() {
        familyList.add(new SecondOption(10100, 1, "史塔克", "/person/Stark/Stark.json"));
        familyList.add(new SecondOption(10200, 1, "兰尼斯特", "/person/Lannister/Lannister.json"));
        familyList.add(new SecondOption(10300, 1, "拜拉席恩", ""));
        familyList.add(new SecondOption(10400, 1, "坦格利安", ""));
        familyList.add(new SecondOption(10500, 1, "徒利", "/person/Tully/Tully.json"));
        familyList.add(new SecondOption(10600, 1, "提利尔", ""));
        familyList.add(new SecondOption(10700, 1, "艾林", ""));
        familyList.add(new SecondOption(10800, 1, "马泰尔", ""));
        familyList.add(new SecondOption(10900, 1, "其他", ""));
    }

    private static void initGeography1() {
        geographyList1.add(new SecondOption(20100, 2, "北境", ""));
        geographyList1.add(new SecondOption(20200, 2, "塞外", ""));
        geographyList1.add(new SecondOption(20300, 2, "河间地", ""));
        geographyList1.add(new SecondOption(20400, 2, "谷地", ""));
        geographyList1.add(new SecondOption(20500, 2, "铁群岛", ""));
        geographyList1.add(new SecondOption(20600, 2, "西境", ""));
        geographyList1.add(new SecondOption(20700, 2, "河湾地", ""));
        geographyList1.add(new SecondOption(20800, 2, "风暴地", ""));
        geographyList1.add(new SecondOption(20900, 2, "多恩", ""));
        geographyList1.add(new SecondOption(21000, 2, "其他", ""));
    }

    private static void initEra() {
        eraList.add(new SecondOption(30100, 3, "古代历史", ""));
        eraList.add(new SecondOption(30200, 3, "坦格利安王朝", ""));
        eraList.add(new SecondOption(30300, 3, "拜拉席恩王朝", ""));
    }

    private static void initGeography2() {
        geographyList2.add(new SecondOption(40100, 4, "北境", ""));
        geographyList2.add(new SecondOption(40200, 4, "塞外", ""));
        geographyList2.add(new SecondOption(40300, 4, "河间地", ""));
        geographyList2.add(new SecondOption(40400, 4, "谷地", ""));
        geographyList2.add(new SecondOption(40500, 4, "铁群岛", ""));
        geographyList2.add(new SecondOption(40600, 4, "西境", ""));
        geographyList2.add(new SecondOption(40700, 4, "河湾地", ""));
        geographyList2.add(new SecondOption(40800, 4, "风暴地", ""));
        geographyList2.add(new SecondOption(40900, 4, "多恩", ""));
        geographyList2.add(new SecondOption(41000, 4, "其他", ""));
    }

    private static void initOption() {
        optionList.add(new Option(10000, 1, "/left_menu_icon/menu_person.png", "人物", familyList));
        optionList.add(new Option(20000, 2, "/left_menu_icon/menu_house.png", "家族", geographyList1));
        optionList.add(new Option(30000, 3, "/left_menu_icon/menu_history.png", "历史", eraList));
        optionList.add(new Option(40000, 4, "/left_menu_icon/menu_castle.png", "城堡", geographyList2));
    }
}
