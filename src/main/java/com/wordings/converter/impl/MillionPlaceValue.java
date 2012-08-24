package com.wordings.converter.impl;

import org.springframework.stereotype.Service;

@Service
public class MillionPlaceValue extends HundredThousandsPlaceValue{
	
	String placeValue = " million";
	
	public String convertPlaceValue(String numberString) {
		int number = Integer.parseInt(numberString.substring(3,6));
		String placeHolder =  super.convert(number);
		placeHolder = (placeHolder != " ")? placeHolder+placeValue : "";
		return placeHolder + super.convertPlaceValue(numberString);
	}

}
