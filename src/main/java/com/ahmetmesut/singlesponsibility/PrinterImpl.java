package com.ahmetmesut.singlesponsibility;

public class PrinterImpl implements IPrinter {

    @Override
    public String printPage(Object page) {
        return "Page content";
    }
}
