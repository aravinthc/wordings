package com.wordings.service.interfaces;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;

public interface INumberInWordsService {

	String returnWordings(@PathVariable String name);
}
