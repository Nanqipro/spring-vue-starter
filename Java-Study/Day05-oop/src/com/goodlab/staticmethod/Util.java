package com.goodlab.staticmethod;

public class Util {
    // 用静态方法设计工具类,工具类没有创建对象的必要，所以建议私有化构造器
    private Util(){}
    public static String getverifycode(int n){
        System.out.println("生成验证码");
        String code = "";
        // 循环n次，每次生成一个验证码
        for (int i = 0; i < n; i++) {
            int type = (int)(Math.random() * 3);
            switch (type) {
                case 0:
                    code += (char)(Math.random() * 26 + 'a');
                    break;
                case 1:
                    code += (char)(Math.random() * 26 + 'A');
                    break;
                case 2:
                    code += (int)(Math.random() * 10);
                    break;
            }

        }
        return code;
    }
}
