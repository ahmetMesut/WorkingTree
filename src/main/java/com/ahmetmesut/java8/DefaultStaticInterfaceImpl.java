package com.ahmetmesut.java8;

public class DefaultStaticInterfaceImpl implements DefaultStaticInterface{

    public static void main(String[] args) {

        System.out.println(DefaultStaticInterface.sum(8,5));

        DefaultStaticInterface instance = new DefaultStaticInterfaceImpl();
        //instance.sum(8,5); => Do not access static method from interface.Only way like above InterfaceName.methodName
        // default method access just like below.
        System.out.println(instance.div(16,4));
    }
}
