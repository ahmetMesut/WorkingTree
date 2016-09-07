package com.ahmetmesut.java8;

public interface DefaultStaticInterface {

    static int sum(int a,int b){
        return (a+b);
    }

    default double div(double a,double b){
        return (a/b);
    }


}
