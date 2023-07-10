package org.campus02.stoff;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BMICalculatorTest {

	private BMICalculator bmiCalculator;

	@BeforeEach
	void setUp() {
		bmiCalculator = new BMICalculator(180, 1.8);
	}

	@Test
	@DisplayName("Konstruktor Test")
	void constructorTest() {
		double expectedWeight = 180;
		double expectedHeight = 1.8;

		assertEquals(expectedWeight, bmiCalculator.getWeightInKg());
		assertEquals(expectedHeight, bmiCalculator.getHeightInMeters());
	}

	@Test
	void result() {
		String result = bmiCalculator.result();
		assertEquals("obese", result);
	}
}