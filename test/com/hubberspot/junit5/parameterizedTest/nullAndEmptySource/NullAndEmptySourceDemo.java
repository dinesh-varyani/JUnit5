package com.hubberspot.junit5.parameterizedTest.nullAndEmptySource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;

import com.hubberspot.junit5.example.StringHelper;

public class NullAndEmptySourceDemo {

	@ParameterizedTest
	@NullSource
	public void testReverseWithNullSource(String input) {
		StringHelper stringHelper = new StringHelper();
		assertEquals(null, stringHelper.reverse(input));
		assertNull(stringHelper.reverse(input));
	}
	
	@ParameterizedTest
	@EmptySource
	public void testReverseWithEmptySource(String input) {
		StringHelper stringHelper = new StringHelper();
		assertEquals("", stringHelper.reverse(input));
	}
	
	@ParameterizedTest
	@NullAndEmptySource
	public void testReverseWithNullAndEmptySource(String input) {
		StringHelper stringHelper = new StringHelper();
		assertEquals(input, stringHelper.reverse(input));
	}
	
	@ParameterizedTest
	@NullSource
	@EmptySource
	public void testReverseWithNullAndEmptySourceCombined(String input) {
		StringHelper stringHelper = new StringHelper();
		assertEquals(input, stringHelper.reverse(input));
	}
	
}
