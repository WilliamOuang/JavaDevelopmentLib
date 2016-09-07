package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class MapReduceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("php");
		
		Stream<String> wordStream = list.stream();
	
		int s1 = wordStream.map(s -> s.length())
				.mapToInt(Integer::new)
				.sum();
		 
		System.out.println(s1);
		
		
		wordStream = list.stream();
		Stream<Integer> lengthStream = wordStream.map(s -> s.length());
		Optional<Integer> sum = lengthStream.reduce((x, y) -> x + y);
		sum.ifPresent(System.out::println);
		

		wordStream = list.stream();

		Stream<Integer> lengthStream1 = wordStream.map(s -> s.length());
		int sum1 = lengthStream1.reduce(0, (x, y) -> x + y);
		System.out.println(sum1);
		
		wordStream = list.stream();
		int s = wordStream.reduce(0, (x, y) -> x + y.length(), (x, y) -> x + y);
		System.out.println(s);
		
		
		
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		//get count of empty string
		int count = (int) strings.stream().filter(a->a.isEmpty()).count();
		System.out.println("count:"+count);
//		Optional<String> string= strings.stream().map(x->x +" "+ x.length()).reduce((x,y)->x+y);
		Optional<String> string= strings.stream().reduce((x,y)->x+y);
	
		System.out.println(string);
		
	}

}
