package com.wordings.converter.impl;

import org.springframework.stereotype.Service;

@Service
public class BillionPlaceValue extends MillionPlaceValue{
	
	String placeValue = " billion";
	
	public String convertPlaceValue(String numberString) {
		int number = Integer.parseInt(numberString.substring(0,3));
		String placeHolder =  super.convert(number);
		placeHolder = (placeHolder != " ")? placeHolder+placeValue : "";
		return placeHolder + super.convertPlaceValue(numberString);
	}


}
