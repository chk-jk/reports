package com.ogiraffers.thread;

public class thread {
    public static void main(String[] args) {
//        두 개의 스레드를 생성하고, 각 스레드에서 고유의 작업을 수행하도록 구현합니다.
//        두 개의 스레드가 동시에 실행되는 것을 확인합니다.
//        결과물로 두 개의 스레드가 동시에 실행되는 것을 보여주는 스크린샷을 제출합니다.

        // Runnable 인터페이스를 통해 task 1 생성 -> 람다식 이용
        Runnable task1 = () -> {
            for(int i = 0; i < 5; i++) {
                System.out.println("Task 1 실행 중 ...");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        // Runnable 인터페이스를 통해 task 2 생성 -> 람다식 이용
        Runnable task2 = () -> {
            for(int i = 0; i < 5; i++) {
                System.out.println("Task 2 실행 중 ...");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        //쓰레드 객체 생성
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        //쓰레드 실행
        thread1.start();
        thread2.start();
    }
}
