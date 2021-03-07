package com.company;

public class Printer {
    private int tonerLevel;
    private int pages;
    private boolean duprixPrinter;

    public Printer(int tonerLevel, boolean duprixPrinter) {
        this.tonerLevel = tonerLevel;
        this.duprixPrinter = duprixPrinter;
        this.pages = 0;
    }

    public void fillUpToner(int tonerLevel) {
        if ((this.tonerLevel <= 100) && (this.tonerLevel >= 0)) {
            this.tonerLevel = tonerLevel;
        }
    }

    public void printingPage(int pages) {
        this.pages = pages;

    }

}
