package com.ahmetmesut.singleton;

public class SingletonThreadSafe {

    private static SingletonThreadSafe singletonThreadSafe;

    private SingletonThreadSafe(){

    }

    public static synchronized SingletonThreadSafe getSingletonThreadSafe() {
        if(singletonThreadSafe == null){
            singletonThreadSafe = new SingletonThreadSafe();
        }
        return singletonThreadSafe;
    }
}
