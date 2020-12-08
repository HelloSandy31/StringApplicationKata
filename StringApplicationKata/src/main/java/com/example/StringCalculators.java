package com.example;

public class StringCalculators {

	public int add(String numbers) throws Exception {

		String[] numbersArray = numbers.split(",|\n");
		int sum = 0;

		if (numbers.isEmpty())
			return 0;
		if (numbersArray.length == 1)
			return Integer.parseInt(numbersArray[0]);
		if (numbersArray.length == 2)

			return Integer.parseInt(numbersArray[0]) + Integer.parseInt(numbersArray[1]);

		// addition for unknow amount of input and also for (\n) delemeter
		for (String input : numbersArray) {
			if (!input.trim().isEmpty()) { //
				sum += Integer.parseInt(input);
				System.out.println(sum);
			}

		}
		return sum;
	}
}