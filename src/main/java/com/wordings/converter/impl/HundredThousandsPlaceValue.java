package com.wordings.converter.impl;

public class HundredThousandsPlaceValue extends ThousandsPlaceValue{

	String placeValue = " thousand";
	
	public String convertPlaceValue(String numberString) {
		int number = Integer.parseInt(numberString.substring(6,9));
		String placeHolder =  super.convert(number);
		placeHolder = (placeHolder != " ")? placeHolder+placeValue : "";
		return placeHolder+super.convertPlaceValue(numberString);
	}
}
