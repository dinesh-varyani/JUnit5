package com.hubberspot.junit5.parameterizedTest.enumSource;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.EnumSource.Mode;

public class EnumSourceDemo {

	@ParameterizedTest
	@EnumSource(value = Animal.class)
	public void enumSourceDemoTest(Animal animal) {
		assertNotNull(animal);
	}
	
	@ParameterizedTest
	@EnumSource(value = Animal.class, names = {"DOG", "CAT"})
	public void enumSourceDemoWithNamesTest(Animal animal) {
		assertNotNull(animal);
	}
	
	@ParameterizedTest
	@EnumSource(value = Animal.class, mode = Mode.EXCLUDE, names = {"DOG", "CAT"})
	public void enumSourceDemoWithExcludeModeTest(Animal animal) {
		assertNotNull(animal);
	}
	
	@ParameterizedTest
	@EnumSource(value = Animal.class, mode = Mode.MATCH_ALL, names = "^(C|L).+$")
	public void enumSourceDemoWithMatchAllModeTest(Animal animal) {
		assertNotNull(animal);
	}
	
}
