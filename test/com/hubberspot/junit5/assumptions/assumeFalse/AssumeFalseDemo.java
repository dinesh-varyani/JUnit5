package com.hubberspot.junit5.assumptions.assumeFalse;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.Test;

public class AssumeFalseDemo {

	
	@Test
	public void assumeFalseWithNoMessage() {
		assumeFalse("DEV".equals(System.getProperty("ENV")));
		
		System.out.println("Assumption passed !!!");
		assertEquals(3, 2 + 1);
	}
	
	@Test
	public void assumeFalseWithMessage() {
		assumeFalse("DEV".equals(System.getProperty("ENV")), "Our assumption Failed !!!");
		
		System.out.println("Assumption passed !!!");
		assertEquals(3, 2 + 1);
	}
	
	@Test
	public void assumeFalseWithMessageSupplier() {
		assumeFalse("DEV".equals(System.getProperty("ENV")), () -> "Our assumption Failed !!!");
		
		System.out.println("Assumption passed !!!");
		assertEquals(3, 2 + 1);
	}
	
	@Test
	public void assumeFalseWithBooleanSupplierAndNoMessage() {
		assumeFalse(() -> "DEV".equals(System.getProperty("ENV")));
		
		System.out.println("Assumption passed !!!");
		assertEquals(3, 2 + 1);
	}
	
	@Test
	public void assumeFalseWithBooleanSupplierAndMessage() {
		assumeFalse(() -> "DEV".equals(System.getProperty("ENV")), "Assumption Failed !!!");
		
		System.out.println("Assumption passed !!!");
		assertEquals(3, 2 + 1);
	}
	
	@Test
	public void assumeFalseWithBooleanSupplierAndMessageSupplier() {
		assumeFalse(() -> "DEV".equals(System.getProperty("ENV")), () -> "Assumption Failed !!!");
		
		System.out.println("Assumption passed !!!");
		assertEquals(3, 2 + 1);
	}
}
