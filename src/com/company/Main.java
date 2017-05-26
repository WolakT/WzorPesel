package com.company;

public class Main {

    public static void main(String[] args) {
        MyPeselSet peselSet = new MyPeselSet();

        System.out.println("START");
        System.out.println(peselSet.add("85021912345"));
        System.out.println(peselSet.add("86000000000"));
        System.out.println(peselSet.add("85021912345"));
        System.out.println("STOP");
    }
}
