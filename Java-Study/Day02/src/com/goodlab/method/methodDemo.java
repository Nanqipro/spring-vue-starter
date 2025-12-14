package com.goodlab.method;

public class methodDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = add(a,b);
//        System.out.println(c);
        add(a,b,c,10);

    }
    // 掌握方法的重载，注意： 方法重载只关心方法名称相同，形参列表不同（类型不同，个数不同，顺序不同），其他都无所谓
    public static int add(int a,int b){
        int c = a+b;
        return c;
    }
    public static int add(int a,int b,int c){
        int d = a+b+c;
        return d;
    }
    public static double add(double a,double b){
        double c = a+b;
        return c;
    }
    public static String add(String a,String b){
        String c = a+b;
        return c;
    }
    public static void add(int a,int b,int c,int d){
        int e = a+b+c+d;
        System.out.println(e);
    }
    // 在无返回值的方法中，可以用return提前结束方法
    public static void div(int a,int b){
        System.out.println("hello world");
        if(b == 0){
            return;
        }
        System.out.println(a/b);
        return;
    }
}
