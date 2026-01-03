package com.goodlab.mapDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class MapTraverseDemo {
    public static void main(String[] args) {
        // map集合的遍历方式
        // 遍历方式1 键找值
        Map<String, Integer> map = new HashMap<>(); // 经典代码
        map.put("huawei", 10);
        map.put("xiaomi", 20);
        map.put("iphone", 30);
        map.put("vivo", 20);
        map.put("huawei", 50);
        map.put(null, null);
        System.out.println(map);
        // 1. 提取所有的map集合中的全部键到一个set集合中
        Set<String> keys = map.keySet();
        // 2. 遍历set集合，获取每一个键
        for (String key : keys) {
            // 3. 通过键获取对应的值
            Integer value = map.get(key);
            System.out.println(key + "=" + value);
        }

        // 遍历方式2 键值对
        // 把Map集合转换成Set集合,里面的元素类型都是键值对类型的（Map.Entry<String,Integer>）
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "===>" + value);
        }

        // 遍历方式3 Lambda
        // map.forEach((k,v)-> System.out.println(k + "===>" + v)); // 简化版本
        System.out.println("_______________________");
        map.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String k, Integer v) {
                System.out.println(k + "========>" + v);
            }
        });

    }
}
