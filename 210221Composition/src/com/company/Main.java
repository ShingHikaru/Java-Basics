package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5);
	    Case theCase = new Case("2208","Dell,", "240",dimensions);

	    Monitor theMonitor = new Monitor("27 inch Beast", "Acer",27,nativeResolution);
	    Motherboard theMotherBoard = new Motherboard("BJ-200","Asus",4,6,,"V2.44");
	    PC thePC = new PC(theCase, theMonitor, theMotherBoard);
	    thePC.getMonitor().drawPixelAt(1500,1200,"red");
	    thePC.getMotherboard().load

    }
}
