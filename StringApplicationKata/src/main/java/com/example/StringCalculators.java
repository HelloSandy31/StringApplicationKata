package com.example;

import java.util.EnumMap;

public class StringCalculators {

	public int add(String numbers) throws Exception {

		String delemiters = ",|\n|;";
		int total = 0;
		String[] numbersArray = numbers.split(delemiters);

		String numbersWithoutDelimiter = numbers;

		// For Empty Values
		if (numbers.isEmpty())
			return 0;
		// For only one values
		if (numbers.length() == 1)
			return Integer.parseInt(numbers);
		// addition for two or unknown amount of number with delimeter(,\n)
		if (numbers.length() > 1 && !numbers.startsWith("//"))
			for (String input : numbersArray) {
				if (!input.trim().isEmpty()) { //
					total += Integer.parseInt(input);

				}

			}

		// Support different delimeters

		if (numbers.startsWith("//")) {
			int slashDelimiterIndex = numbers.indexOf("\n" + 1);
			String newStringAfterSlash = numbers.substring(slashDelimiterIndex, numbers.length());
			char[] newArr = newStringAfterSlash.toCharArray();
			for (int i = 0; i < newArr.length; i++) {
				if (newArr[i] >= '0' && newArr[i] <= '9')

				{

					total = total + (Character.getNumericValue(newArr[i]));

				}

			}

		}
		return total;

	}

}