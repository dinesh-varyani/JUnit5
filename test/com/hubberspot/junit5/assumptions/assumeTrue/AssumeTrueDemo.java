package com.hubberspot.junit5.assumptions.assumeTrue;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.Test;

public class AssumeTrueDemo {
	
	@Test
	public void assumeTrueWithNoMessage() {
		assumeTrue("DEV".equals(System.getProperty("ENV")));
		
		System.out.println("Assumption passed !!!");
		assertEquals(3, 2 + 1);
	}
	
	@Test
	public void assumeTrueWithMessage() {
		assumeTrue("DEV".equals(System.getProperty("ENV")), "Assumption Failed !!!");
		
		System.out.println("Assumption passed !!!");
		assertEquals(3, 2 + 1);
	}
	
	@Test
	public void assumeTrueWithMessageSupplier() {
		assumeTrue("DEV".equals(System.getProperty("ENV")), () -> "Assumption Failed !!!");
		
		System.out.println("Assumption passed !!!");
		assertEquals(3, 2 + 1);
	}
	
	@Test
	public void assumeTrueWithBooleanSupplierAndNoMessage() {
		assumeTrue(() -> "DEV".equals(System.getProperty("ENV")));
		
		System.out.println("Assumption passed !!!");
		assertEquals(3, 2 + 1);
	}
	
	@Test
	public void assumeTrueWithBooleanSupplierAndMessage() {
		assumeTrue(() -> "DEV".equals(System.getProperty("ENV")), "Assumption Failed !!!");
		
		System.out.println("Assumption passed !!!");
		assertEquals(3, 2 + 1);
	}
	
	@Test
	public void assumeTrueWithBooleanSupplierAndMessageSupplier() {
		assumeTrue(() -> "DEV".equals(System.getProperty("ENV")), () -> "Assumption Failed !!!");
		
		System.out.println("Assumption passed !!!");
		assertEquals(3, 2 + 1);
	}
	
}
