package com.wordings.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wordings.converter.impl.NumberConverter;
import com.wordings.service.interfaces.INumberInWordsService;

@Controller
public class NumberInWordsServiceImpl implements INumberInWordsService {
	
	@Autowired
	NumberConverter numberConverter; 
	
	@RequestMapping(value="/{value}/", method = RequestMethod.GET)
	public @ResponseBody String returnWordings(@PathVariable String value) {
		return numberConverter.convertNumberInWords(value);
	}

}