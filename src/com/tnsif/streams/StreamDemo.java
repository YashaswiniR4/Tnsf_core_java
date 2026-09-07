package com.tnsif.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		//By using of()
		Stream stream = Stream.of(10,20,30); 
		
		//By using the stream()
		List<Integer> l=new ArrayList<Integer>();
		l.add(100);
		l.add(200);
		stream=l.stream();
		
		//Using the array
		int arr[]=new int[5];
		arr[0]=23;
		arr[1]=90;
		
		stream=Stream.of(arr);

	}
}