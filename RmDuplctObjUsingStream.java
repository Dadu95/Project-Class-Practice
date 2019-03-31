package com.app.corejava.interview;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
/**
 * 
 * @author RS RATHOUR
 * this class is removing duplicate object from list using stream and grouping
 */
public class RmDuplctObjUsingStream {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("A", "B", "C", "D", "D", "C");
		list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream()
				
				 //.filter(e -> e.getValue() > 1L) 
				 
				.map(e -> e.getKey())
				 
				.collect(Collectors.toList())
				.forEach(System.out::println);
		;
	}

}
