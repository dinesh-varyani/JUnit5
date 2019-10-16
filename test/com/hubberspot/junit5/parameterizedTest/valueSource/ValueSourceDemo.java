package com.hubberspot.junit5.parameterizedTest.valueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.hubberspot.junit5.example.Calculator;

public class ValueSourceDemo {

	@Test
	public void testEvenValues() {
		Calculator calculator = new Calculator();
		assertTrue(calculator.isEvenNumber(2));
		
		assertTrue(calculator.isEvenNumber(4));
		
		assertTrue(calculator.isEvenNumber(6));
		
		assertTrue(calculator.isEvenNumber(7));
		
		assertTrue(calculator.isEvenNumber(8));
		
		assertTrue(calculator.isEvenNumber(12));
	}
	
	@ParameterizedTest
	@ValueSource(ints = {2, 4, 6, 8, 7, 10})
	public void testEvenValuesUsingParamaterizedTest(int number) {
		Calculator calculator = new Calculator();
		assertTrue(calculator.isEvenNumber(number));
	}
	
}
