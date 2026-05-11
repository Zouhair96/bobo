package com.opspilot;

public class App {
    public static void main(String[] args) {
        String text = "hello";
        int result = text + 42;  // type incompatible — ne compile pas
        System.out.println(result);
    }
}
