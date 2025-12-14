package com.goodlab.FlowControl;

public class FlowControlDemo {
    public static void main(String[] args) {
        System.out.println("=== Java流程控制示例 ===\n");

        // 1. 顺序结构
        System.out.println("1. 顺序结构示例:");
        System.out.println("开始执行");
        System.out.println("执行第一步");
        System.out.println("执行第二步");
        System.out.println("执行结束\n");

        // 2. 选择结构
        System.out.println("2. 选择结构示例:");
        int score = 85;
        if (score >= 90) {
            System.out.println("成绩等级: A");
        } else if (score >= 80) {
            System.out.println("成绩等级: B");  // 这个会执行
        } else if (score >= 70) {
            System.out.println("成绩等级: C");
        } else {
            System.out.println("成绩等级: D");
        }

        // switch示例
        String dayOfWeek = "Monday";
        System.out.print("今天是: ");
        switch (dayOfWeek) {
            case "Monday":
                System.out.println("星期一");
                break;
            case "Tuesday":
                System.out.println("星期二");
                break;
            default:
                System.out.println("其他日子");
        }

        // 3. 循环结构
        System.out.println("\n3. 循环结构示例:");

        // for循环
        System.out.print("for循环 (1-5): ");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // while循环
        System.out.print("while循环 (倒计时): ");
        int countdown = 3;
        while (countdown > 0) {
            System.out.print(countdown + " ");
            countdown--;
        }
        System.out.println();

        // do-while循环
        System.out.print("do-while循环 (至少执行一次): ");
        int num = 0;
        do {
            System.out.print(num + " ");
            num++;
        } while (num < 3);
        System.out.println();

        // 增强for循环
        System.out.println("\n4. 增强for循环示例:");
        String[] fruits = {"苹果", "香蕉", "橙子"};
        for (String fruit : fruits) {
            System.out.println("水果: " + fruit);
        }

        // 5. 跳转语句
        System.out.println("\n5. 跳转语句示例:");

        // break示例
        System.out.print("break示例 (遇到5跳出): ");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) break;
            System.out.print(i + " ");
        }
        System.out.println();

        // continue示例
        System.out.print("continue示例 (跳过3): ");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) continue;
            System.out.print(i + " ");
        }
        System.out.println();

        // 6. 异常处理
        System.out.println("\n6. 异常处理示例:");
        try {
            System.out.println("尝试除法运算...");
            int result = divide(10, 0);
            System.out.println("结果: " + result);
        } catch (ArithmeticException e) {
            System.out.println("捕获到异常: " + e.getMessage());
        } finally {
            System.out.println("finally块执行 - 资源清理");
        }
    }

    // 辅助方法用于异常处理示例
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("除数不能为零");
        }
        return a / b;
    }
}
