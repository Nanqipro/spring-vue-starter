package com.goodlab.abstract3;

public abstract class People {
    // 模板方法
    public final void write(){
        System.out.println("写代码");
        System.out.println("提交代码");
        // 模板方法知道子类一定要实现合并代码的方法，但是不知道子类实现
        mergeCode();
        System.out.println("查看代码");
        System.out.println("测试代码");
    }
    public abstract void mergeCode();
}
