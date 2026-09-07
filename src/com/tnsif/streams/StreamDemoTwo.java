package com.tnsif.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemoTwo {

	public static void main(String[] args) {
		List<String> names=new ArrayList<String>();
		names.add("Yashu");
		names.add(("Alex"));
		names.add("bob");
		names.add("Ranju");
		names.add("david");
		names.add("sita");
		
		List<String> processedNames=names.stream().filter(name -> name.length()>5). 
				map(String :: toUpperCase).sorted().collect(Collectors.toList());
				
		System.out.println(processedNames);		

	}

}