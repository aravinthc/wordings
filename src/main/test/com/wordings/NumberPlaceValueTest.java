package com.wordings;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.wordings.converter.impl.BillionPlaceValue;
import com.wordings.converter.impl.NumberConverter;
import com.wordings.converter.interfaces.NumberPlaceValue;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader=AnnotationConfigContextLoader.class)
public class NumberPlaceValueTest {
	
	@Autowired
	NumberConverter numberConverter;  
	
	@Configuration
    static class ContextConfiguration {
        // this bean will be injected into the OrderServiceTest class
        @Bean
        public NumberConverter numberConverter() {
            return new NumberConverter();
        }
        
        @Bean @Qualifier("billionPlaceValue")
        public NumberPlaceValue BillionPlaceValue(){
        	return new BillionPlaceValue();
        }
    }


	@Test
	public void test() {
		System.out.println(this.numberConverter.convertNumberInWords("999999999999"));
		
	}

}
