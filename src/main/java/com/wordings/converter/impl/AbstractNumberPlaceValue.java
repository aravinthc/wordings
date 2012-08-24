package com.wordings.converter.impl;

import org.springframework.stereotype.Service;

import com.wordings.converter.interfaces.NumberPlaceValue;

@Service
public abstract class AbstractNumberPlaceValue implements NumberPlaceValue {

	public String convert(int number) {
		String numberInWord;

		if (number % 100 < 20) {
			numberInWord = numberNames[number % 100];
			number = number/100;
		} else {
			numberInWord = numberNames[number % 10];
			number = number/10;

			numberInWord = tensNames[number % 10] + numberInWord;
			number = number/10;
		}
		if (number == 0)
			return numberInWord;
		return numberNames[number] + " hundred" + numberInWord;
	}

}
