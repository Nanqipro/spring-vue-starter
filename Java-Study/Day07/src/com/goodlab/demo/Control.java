package com.goodlab.demo;

public class Control {

    public void controldevice(JD jd) {
        System.out.println(jd.getName() + "当前的状态是"+(jd.isStatus() ? "打开" : "关闭"));
        jd.press();
        System.out.println(jd.getName() + "当前状态是"+(jd.isStatus() ? "打开" : "关闭"));

    }
}
