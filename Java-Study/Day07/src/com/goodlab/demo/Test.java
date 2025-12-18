package com.goodlab.demo;

public class Test {

    public static void main(String[] args) {
        JD[] jds = new JD[4];
        jds[0] = new Lamp("灯", true);
        jds[1] = new WashMachine("洗衣机", false);
        jds[2] = new TV("电视", true);
        jds[3] = new Air("空调", true);
        Control control = new Control();
        control.controldevice(jds[1]);
    }

}
