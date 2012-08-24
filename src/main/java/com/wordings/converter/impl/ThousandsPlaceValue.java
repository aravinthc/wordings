package com.wordings.converter.impl;

import org.springframework.stereotype.Service;

@Service
public class ThousandsPlaceValue extends AbstractNumberPlaceValue{
	
	public String convertPlaceValue(String numberString) {
		int number = Integer.parseInt(numberString.substring(9,12));
		return super.convert(number);
	}

}
