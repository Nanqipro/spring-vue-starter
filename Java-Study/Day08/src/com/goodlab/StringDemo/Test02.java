package com.goodlab.StringDemo;

public class Test02 {
    public static void main(String[] args) {
        // 生成验证码
        String s = getCode(50);
        System.out.println(s);

    }
    public static String getCode(int n) {
        // 定义一个变量记住所有字符
        String code = "";
        // 生成所有字符
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        // 循环随机获取字符
        for(int i = 0;i<n;i++){
            // 随机一个索引
            int index  = (int)(Math.random()*str.length());
            code += str.charAt(index);
        }
        return code;


    }
}
