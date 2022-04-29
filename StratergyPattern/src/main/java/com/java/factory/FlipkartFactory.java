package com.java.factory;

import com.java.component.BlueDart;
import com.java.component.Courier;
import com.java.component.DTDC;
import com.java.component.Flipkart;

public class FlipkartFactory {
	
	// static factory method
	public static Flipkart getInstance(String courierType) {
		// create dependent class obj
		Courier courier = null;
		if(courierType.equalsIgnoreCase("dtdc")) {
			courier = new DTDC();
		}
		else if(courierType.equalsIgnoreCase("bluedart")) {
			courier = new BlueDart();
		}
		else {
			 throw new IllegalArgumentException("invalid courier type");
		}
		// create target class obj
		Flipkart fkpt = new Flipkart();
		fkpt.setCourier(courier);
		
	
		return fkpt;
		
	}
}
