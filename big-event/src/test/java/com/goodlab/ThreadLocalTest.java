package com.goodlab;

import org.junit.jupiter.api.Test;

public class ThreadLocalTest {
    @Test
    public void testThreadLocalSetAndGet() {

        // 提供一共 threadlocal 对象，
        ThreadLocal tl = new ThreadLocal<>();


        // 开启两个线程
        new Thread(() -> {
            tl.set("thread-1");
            System.out.println(tl.get());
            System.out.println(tl.get());
            System.out.println(tl.get());
        }, "thread-1").start();
        new Thread(() -> {
            tl.set("thread-2");
            System.out.println(tl.get());
            System.out.println(tl.get());
            System.out.println(tl.get());
        }, "thread-2").start();

    }
}
