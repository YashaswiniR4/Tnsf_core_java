package com.tnsif.streams;

import java.util.stream.Stream;

public class StreamFunctions {
	// Count the empty Strings
			public static long countEmptyStrings(Stream<String> stream) {
				long count = 0;
				count = stream.filter(x -> x.isEmpty()).count();
				return count;
			}
			
			// Count String with length more than given number
			public static long countStrings(Stream<String> stream, int n) {
				long num = stream.filter(x -> x.length() > n).count();
				return num;
			}

}