package com.example.recyclerdummydatalibrary;

import java.util.ArrayList;
import java.util.List;

public class DummyData {
    static String lorem = "Lorem Ipsum is simply dummy text";

    public static List<String> getListString(int listSize){
        List<String> list = new ArrayList<>();

        for(int i=0; i<listSize; i++){
            list.add(lorem);
        }

        return list;
    }
}
