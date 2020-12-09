package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.Test;

import com.example.StringCalculators;

public class TestCalculator {
	public static StringCalculators sc = new StringCalculators();

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

	@Test
	// Testing for support different delimiter
	public void supportDiffDelimeter() throws Exception {
		assertEquals(sc.add("//;\n1;2"), 3);

	}

	@Test(expected = Exception.class)
	public void negativeInputReturnsException() throws Exception {
		sc.add("-10");
	}

	@Test(expected = Exception.class)
	public void multipleNegativeInputReturnsException() throws Exception {
		sc.add("-10,40,-30,-20,39");
	}

	@AfterClass
	public static void getAllCountOfAdd() {

		sc.getCalledCount();

	}
	
	@Test
	//Testing for bigger than 1000 value
    public final void greaterThan1000NotAllowedInSum() throws Exception {
        assertEquals(3+1000+6, sc.add("3,1000,1001,6,1234"));
    }

	
	@Test
	// Testing for delimiter of any length
	public void supportDelimeterOfAnyLength() throws Exception {
		assertEquals(sc.add("//[***]\n1***2***3"), 6);

	}

}
