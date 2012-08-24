package com.wordings.converter.impl;

import java.text.DecimalFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.wordings.converter.interfaces.NumberPlaceValue;

@Service
public class NumberConverter {
	
	@Autowired
	@Qualifier("billionPlaceValue")
	NumberPlaceValue placeValue;
	
	static String PADD = "000000000000";
	
	public String convertNumberInWords(String numberString){
		if(numberString.length() <= 12){
			Long number = Long.parseLong(numberString);
			if (number == 0) 
				return "zero"; 
		    DecimalFormat decimalFormat = new DecimalFormat(PADD);
		    numberString = decimalFormat.format(number);
		    String value = placeValue.convertPlaceValue(numberString);
			return value;
		}
		return "Number Too Long...";
	}
}
