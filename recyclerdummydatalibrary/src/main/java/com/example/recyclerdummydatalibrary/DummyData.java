package com.example.recyclerdummydatalibrary;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DummyData {
    static String lorem[] = {
            "Lorem Ipsum is simply dummy text",
            "Phasellus nisi elit, hendrerit feugiat nisi",
            "Suspendisse libero leo, faucibus et",
            "Proin eget mi eu magna imperdiet ultrices.",
            "Nulla facilisi. Morbi ultrices nulla",
            "In ex erat, tincidunt at lacus vitae",
            "Curabitur tincidunt, sem vel lacinia",
            "Vestibulum ante ipsum primis in"
    };

    public static List<String> getListString(int listSize){
        List<String> list = new ArrayList<>();
        Random r = new Random();

        for(int i=0; i<listSize; i++){
            list.add(lorem[r.nextInt(8)]);
        }

        return list;
    }

    public static String getString(){
        Random r = new Random();
        return lorem[r.nextInt(8)];
    }
}
