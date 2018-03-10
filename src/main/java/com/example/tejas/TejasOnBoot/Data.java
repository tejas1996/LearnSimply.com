package com.example.tejas.TejasOnBoot;


import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class Data {
    HashMap<String, String> demoTemp = new HashMap<>();

    public void add(String key, String value) {
        demoTemp.put(key, value);
        System.out.println(demoTemp);
    }

    public String getArticle(String key) {
        return demoTemp.get(key);
    }

    public HashMap<String, String> getAll() {
        return demoTemp;
    }


}
