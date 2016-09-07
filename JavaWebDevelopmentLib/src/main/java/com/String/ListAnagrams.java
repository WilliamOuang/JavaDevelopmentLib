package com.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ListAnagrams {

	public static void main(String[] args) {

		String arr[] ={"lint", "intl", "inlt", "code"};
		String arr1[] ={"ab", "ba", "cd", "dc", "e"};

		//anagrams(arr).stream().forEach(System.out::println);
		anagrams(arr1).stream().forEach(System.out::println);

		
	}
	
	public static List<String> anagrams(String[] strs) {
		return null;
		
		// William Will write 
		
		
		
		
		
		
		
		
		
		
		
		
		
//        // write your code here
//        HashMap<String, ArrayList<String>> record = new HashMap<String, ArrayList<String>>();
//        List<String> res = new ArrayList<String>();
//        
//        for(String s : strs){
//            char[] arr = s.toCharArray();
//            Arrays.sort(arr);
//            String newWord = new String(arr);
//            if(!record.containsKey(newWord)){
//                record.put(newWord, new ArrayList<String>());
//            }
//             record.get(newWord).add(s);
//        }
//        
//        for(String s : record.keySet()){
//            if(record.get(s).size() > 1){
//                res.addAll(record.get(s));
//            }
//        }
//        return res;
        
    }


}
