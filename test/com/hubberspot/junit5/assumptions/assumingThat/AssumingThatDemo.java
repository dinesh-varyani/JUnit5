package com.hubberspot.junit5.assumptions.assumingThat;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import org.junit.jupiter.api.Test;

public class AssumingThatDemo {

	@Test
	public void assumingThatWithBooleanCondition() {
		assumingThat("DEV".equals(System.getProperty("ENV")), () -> {
			System.out.println("Dev environment !!!");
			assertEquals(5, 3 + 2);
		});
		// below code gets executed in every environment
		System.out.println("Executed in every environment !!!");
		assertEquals(3, 2 + 1);
	}
	
	@Test
	public void assumingThatWithBooleanSupplier() {
		assumingThat(() -> "DEV".equals(System.getProperty("ENV")), () -> {
			System.out.println("Dev environment !!!");
			assertEquals(5, 3 + 2);
		});
		// below code gets executed in every environment
		System.out.println("Executed in every environment !!!");
		assertEquals(3, 2 + 1);
	}
	
}
