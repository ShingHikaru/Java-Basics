package com.company;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, boolean duprixPrinter) {
        if ((tonerLevel <= 100) && (tonerLevel >= 0)) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.duplexPrinter = duprixPrinter;
        this.pagesPrinted = 0;
    }

    public int fillUpToner(int tonerAmount) {
        if(tonerLevel >0 && tonerAmount <= 100) {
            if(tonerAmount >0 && tonerLevel <= 100) {
                return -1;
            }
                this.tonerLevel += tonerAmount;
                return this.tonerLevel;
            } else {
            return -1;
        }
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if(this.duplexPrinter) {
            pagesToPrint /= 2;
            System.out.println("Printing in duplex mode.");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }



}
