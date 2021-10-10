package com.github.jeremyrempel.buysellhold;

public class ThreadTest {

    public static void main(String[] a) throws Exception {

        Thread main = Thread.currentThread();
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("TERM");
            main.interrupt();
            for (int i = 0; i < 4; i++) {
                System.out.println("cleanup");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            }
            System.out.println("exit");
        }));

        while (true) {
            Thread.sleep(1000);
            System.out.println("run");
        }
    }
}
