package com.tnsif.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamFunctionsDemo {

	public static void main(String[] args) {
		List<String> strList = Arrays.asList("Nashik", "", "Bangalore", "", "Chennai", "Mumbai", "Pune"); // source
		System.out.println("List of Cities is " + strList);

		// retrieve the stream
		Stream<String> stream = strList.stream();

		// Counting the empty strings
		long count = StreamFunctions.countEmptyStrings(stream);
		System.out.printf("List %s has %d empty strings \n", strList, count);

		// Counting String with length more than 8

				count = StreamFunctions.countStrings(strList.stream(), 8);
				System.out.printf("List %s has %d strings of length more than 8 \n", strList, count);

	}

}