package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.example.StringCalculators;

public class TestCalculator {
	public StringCalculators sc = new StringCalculators();

	@Test
	// Testing for empty value
	public void emptyStringreturnZero() throws Exception {
		assertEquals(sc.add(""), 0);
	}

	@Test
	// Testing for SingleValues
	public void singleValueReturn() throws Exception {
		assertEquals(sc.add("1"), 1);
	}

	@Test
	// Testing for Two values with comma
	public void twoValueWithCommaDelimeted() throws Exception {
		assertEquals(sc.add("1,2"), 3);
	}

	@Test
	public void unknownAmountOfNumbers() throws Exception {

		assertEquals(sc.add("1,2,3"), 6);

	}

	@Test
	// Testing the Newline delimiter(\n)
	public void addingValuesWithNewline() throws Exception {
		assertEquals(sc.add("2\n2,3"), 7);

	}

}
