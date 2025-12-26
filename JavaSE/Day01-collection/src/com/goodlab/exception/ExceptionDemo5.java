package com.goodlab.exception;


import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo5 {
    public static void main(String[] args) {
        // 掌握异常的处理方案1 底层异常都抛出异常信息给最外层调用者，最外层捕获异常，记录异常，响应合适的信息给用户看
        System.out.println("程序开始");
        try {
            show();
            System.out.println("程序正常结束");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("程序异常了");
        }


        System.out.println("程序结束");

    }
    public static void show() throws Exception{
        // 编译异常，编译阶段报错，编译不通过
        String str = "2025-12-------25 11:11:11";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(str);
        System.out.println(date);

        InputStream is = new FileInputStream("d:/a.txt");

    }

}
