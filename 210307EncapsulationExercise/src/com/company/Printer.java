package com.company;

public class Printer {
    private int tonerLevel;
    private int pages;
    private boolean duprixPrinter;

    public Printer(int tonerLevel, boolean duprixPrinter) {
        if ((tonerLevel <= 100) && (tonerLevel >= 0)) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.duprixPrinter = duprixPrinter;
        this.pages = 0;
    }

    public void fillUpToner(int tonerAmount) {
        if(tonerLevel >0 && tonerAmount <= 100) {
            if(tonerAmount >0 && tonerLevel <= 100) {
                if (this.tonerLevel)
            }
        }

    }

    public void printingPage(int pages) {
        this.pages = pages;

    }

}
