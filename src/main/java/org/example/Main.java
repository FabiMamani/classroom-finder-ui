package org.example;

public class Main {
    public static CoreMock core;
    public static void main(String[] args) {
        core = new CoreMock();
        System.out.println("########################################");
        System.out.println(core.msjMock());
        System.out.println("########################################");
    }
}