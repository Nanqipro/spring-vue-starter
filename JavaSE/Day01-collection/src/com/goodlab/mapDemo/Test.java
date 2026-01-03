package com.goodlab.mapDemo;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        // 创建Map集合
        Map<String, Integer> map = new HashMap<>(); // 经典代码
        map.put("huawei", 10);
        map.put("xiaomi", 20);
        map.put("iphone", 30);
        map.put("vivo", 20);
        map.put("huawei", 50);
        map.put(null, null);
        System.out.println(map);

    }
}
