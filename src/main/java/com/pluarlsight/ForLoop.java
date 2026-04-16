package com.pluarlsight;

public class ForLoop {
    public static void main(String[] args) throws InterruptedException {
        for(int i = 10; i > 0; i--){
            Thread thread = null;
            thread.sleep(1000);
            System.out.println(i);
        }
        System.out.println("Launch!");
    }
}
