package com.example;

import java.util.ArrayList;
import java.util.List;

public class StringCalculators {
	int count = 0;

	public int add(String numbers) throws Exception {

		String delemiters = ",|\n|;";
		int total = 0;
		count++;
		String[] numbersArray = numbers.split(delemiters);
		List<Integer> negativeNumbers = new ArrayList<Integer>();

		// For Empty Values
		if (numbers.isEmpty())
			return 0;
		// For only one values
		if (numbers.length() == 1)
			return Integer.parseInt(numbers);
		// addition for two or unknown amount of number with delimeter(,\n)
		if (numbers.length() > 1 && !numbers.startsWith("//"))
			for (String input : numbersArray) {
				if (!input.trim().isEmpty()) {
					//For more than 1000 will be ignored
					if(Integer.parseInt(input)>1000)
						continue;
					int numberInt = Integer.parseInt(input.trim());

					// For negative Value will show exception message
					if (numberInt < 0) {
						negativeNumbers.add(numberInt);
					}
					total += numberInt;

				}
				if (negativeNumbers.size() > 0) {
					throw new RuntimeException("Negatives not allowed: " + negativeNumbers.toString());
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

//Getting total count to add() method
	public int getCalledCount() {
		return count;

	}

}
