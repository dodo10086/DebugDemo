package com.dy.debug;

import java.util.HashMap;
import java.util.Map;

/**
 * @author dy
 * @date 2022/8/3 13:26
 */
public class DebugTest {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
        HashMap<String,String> map = new HashMap<>();
        map.put("name","dy");
        map.put("age","22");
        map.put("school","Tsinghua");
        map.put("major","computer");

        String age = map.get("age");
        System.out.println(age);
        System.out.println("age = " + age);

        map.remove("major");
        System.out.println(map);
        System.out.println("更新项目");

    }



}
