package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.jasper.tagplugins.jstl.core.Out;
import org.eclipse.jdt.internal.compiler.lookup.ReductionResult;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

import sun.net.www.content.audio.x_aiff;


public class ListToArray {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		List<String> list= Arrays.asList("1","2","4","1");
		List<Integer> in= Arrays.asList(1,3,4,1);

		String s[]=	listToArray(list);
		
		//System.out.println(Arrays.toString(s));
		//list.stream().map(x->x+"1").collect(Collectors.toList()).forEach(x->System.out.println(x));
		int asInt = in.stream().distinct().filter(x->x>2).mapToInt(x->x).max().getAsInt();
		System.out.println(asInt);
		//collect(Collectors.toList()).forEach(System.out::println);

		List listWithoutDup = new ArrayList(new HashSet(list));
		System.out.println(listWithoutDup.toString());

	}
	
	static String[] listToArray(List l){
		
		return (String[]) l.stream().toArray(String[]::new);
		//return null;
		
	} 

}
