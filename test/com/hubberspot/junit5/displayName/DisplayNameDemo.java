package com.hubberspot.junit5.displayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("@DisplayName annotation demo")
public class DisplayNameDemo {

	@Test
	@DisplayName("@DisplayName demo test")
	public void displayNameDemoTest() {
		assertEquals(3, 2 + 1);
	}
	
	@Test
	@DisplayName("@DisplayName demo with spaces")
	public void displayNameDemoWithSpaces() {
		assertEquals(3, 2 + 1);
	}
	
	@Test
	@DisplayName("@DisplayName demo with ╯°□°）╯ @!~ special characters")
	public void displayNameDemoWithSpecialCharacters() {
		assertEquals(3, 2 + 1);
	}
	
	@Test
	@DisplayName("@DisplayName demo with emojis - 😱")
	public void displayNameDemoWithEmojis() {
		assertEquals(3, 2 + 1);
	}
	
}
