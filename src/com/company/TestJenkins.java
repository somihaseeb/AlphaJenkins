package com.company;

public class TestJenkins {
    public static void main(String[] args) throws InterruptedException {

        for (int i=0; i<5; i++){
            System.out.println("batch 10 is great");
            Thread.sleep(2000);
        }
    }
}
