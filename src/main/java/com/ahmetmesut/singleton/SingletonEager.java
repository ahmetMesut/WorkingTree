package com.ahmetmesut.singleton;

public class SingletonEager {

    public static SingletonEager signletonEager = new SingletonEager();

    private SingletonEager() {

    }

    public static SingletonEager getSignletonEager() {
        return signletonEager;
    }
}