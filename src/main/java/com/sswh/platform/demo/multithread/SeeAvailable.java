package com.sswh.platform.demo.multithread;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 验证多核场景下的可见性
 */
@Slf4j
public class SeeAvailable {
   // private static long count = 0;
   static AtomicLong count = new AtomicLong();

    private synchronized void add10K() {
        int idx = 0;
        while (idx++ < 10000) {
            count.incrementAndGet();
        }
    }


    public static long calc() throws InterruptedException {
        final SeeAvailable seeAvailable = new SeeAvailable();
        // 创建两个线程，执行add()操作
        Thread th1 = new Thread(() -> {
            seeAvailable.add10K();
        });
        Thread th2 = new Thread(() -> {
            seeAvailable.add10K();
        });
        // 启动两个线程
        th1.start();
        th2.start();
        // 等待两个线程执行结束
        th1.join();
        th2.join();
        return count.get();
    }

    public static void main(String[] args) {
        try {
            long calc = calc();
            System.out.println(calc);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}