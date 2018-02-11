package com.example.tejas.TejasOnBoot;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;

@Service
public class StudentService {
    HashMap<String, String> map = new HashMap<>();

    @PostConstruct
    private void init() {

        map.put("names", "age");
        map.put("tejas", "21");
        map.put("masand", "22");
        map.put("sev", "23");
    }

    public HashMap<String, String> getStudents() {
        return map;
    }

    public String getSingle(String id) {
        return map.get(id);
    }

}
