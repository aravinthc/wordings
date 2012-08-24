package com.wordings.converter.interfaces;

public interface NumberPlaceValue {

	static final String[] tensNames = { " ", " ten", " twenty", " thirty",
			" forty", " fifty", " sixty", " seventy", " eighty", " ninety" };

	static final String[] numberNames = { " ", " one", " two", " three",
			" four", " five", " six", " seven", " eight", " nine", " ten",
			" eleven", " twelve", " thirteen", " fourteen", " fifteen",
			" sixteen", " seventeen", " eighteen", " nineteen" };

	String convert(int num);

	String convertPlaceValue(String numberString);

}
