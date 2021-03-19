package com.aakash;

public class Printer {

//    private int tonerLevel;
//    private int pagesPrinted;
//    private boolean isDuplex;
//
//    public Printer(int tonerLevel, int pagesPrinted, boolean isDuplex) {
//        if (tonerLevel > 0 && tonerLevel <= 100) {
//            this.tonerLevel = tonerLevel;
//        }
//        this.pagesPrinted = pagesPrinted;
//        this.isDuplex = isDuplex;
//    }
//
//    public void fillToner(int inFilled) {
//        this.tonerLevel = this.tonerLevel + inFilled;
//        System.out.println(this.tonerLevel + "% of toner is filled");
//        if (tonerLevel >= 100) {
//            System.out.println("Toner is full");
//        }
//    }
//
//    public void printPage(int printNew) {
//        this.pagesPrinted += printNew;
//        if (isDuplex) {
//            System.out.println(this.pagesPrinted + " Pages printed on a Duplex Printer");
//        } else {
//            System.out.println(this.pagesPrinted + " Pages printed on a Normal printed");
//        }
//    }
//
//    public int getTonerLevel() {
//        return tonerLevel;
//    }
//
//    public int getPagesPrinted() {
//        return pagesPrinted;
//    }
//
//    public boolean isDuplex() {
//        return isDuplex;
//    }

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }

        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (this.tonerLevel + tonerAmount > 100) {
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
        if (this.duplex) {
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("Printing in Duplex mode");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
