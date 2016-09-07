package com.String;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

import jdk.internal.org.objectweb.asm.commons.StaticInitMerger;

public class ContainString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(solution("ABCD","AB"));
//		System.out.println(solution("ABCD","AE"));
//		
//		System.out.println(checkBrother_2("ABC".toCharArray(), "CBA".toCharArray()));
//		System.out.println(checkBrother_2("ABC".toCharArray(), "CBA".toCharArray()));

		System.out.println(indexOf("",""));
		System.out.println(compareString("AB","C"));
		char aa[]="".toCharArray();
		

		

	}
	
	public static boolean compareString(String A,String B){
		int[] c=new int[26];
		for(int i=0;i<A.length();i++){
			c[(int)A.charAt(i)-'A']++;
		}
		for(int j=0;j<B.length();j++){
			c[(int)B.charAt(j)-'A']--;
			if(c[(int)B.charAt(j)-'A']<0){
				return false;
			}
		}
		return true;
		
	}
	
	public static int indexOf(String str,String search){
		if(str==null || search == null){
			return -1;
		}
		char arr[] = str.toCharArray();
		char sea[] = search.toCharArray();
		int index = -1;
		for(int i=0;i<arr.length-sea.length+1;i++){
			int count=0;
			for(int j=0;j<sea.length;j++){
				if(arr[i+j]==sea[j]){
					count++;
				}else{
					break;
				}
			}
			if(count==sea.length){
				return i;
			}
		}
		
		
		return index;
		
		
		
		
		
//		if(s.length()<t.length()){
//            return -1;
//        }
//        char s1[]=s.toCharArray();
//        char t1[]=t.toCharArray();
//        
//        for(int i=0;i<s1.length-t1.length+1;i++){
//            int count=0;
//            for(int j=0;j<t1.length;j++){
//                if(s1[i+j]==t1[j]){
//                    count++;
//                }else{
//                	break;
//                }
//                if(count==t1.length){
//                    return i;
//                }
//            }
//            
//        }    
//        
//        
//        return -1;
		
	}
	
	
	
	
	
	
	static boolean solution(String a, String b){
	        int hash = 0;
	        // 对字符串A，用位运算计算一个签名
	        for(int i=0;i<a.length();i++){
	            System.out.println(1<<(a.charAt(i)- 'A'));
	            hash = hash | (1<<(a.charAt(i)- 'A'));
	        }
			System.out.println("===="+hash);

	        for(int i=0;i<b.length();i++){
	            if((hash & (1<<(b.charAt(i)- 'A'))) ==0){
	                return false;
	            }
	        }
	        return true;
	    }
	
	
	public static boolean checkBrother_2(char[] s1, char[] s2){
	    HashMap<Character, Integer> recordTable = new HashMap<Character, Integer>();
	    for(char s: s1){
	        if(!recordTable.containsKey(s))
	            recordTable.put(s, 1);
	        else{
	            recordTable.put(s, recordTable.get(s) + 1);
	        }
	    }

	    for(char s : s2){
	        recordTable.put(s, recordTable.get(s) - 1);
	    }

	    int count = 0;
	    Collection c = recordTable.values();
	    Iterator iter = c.iterator();

	    while(iter.hasNext()){
	        count += Math.abs((Integer) iter.next());
	    }

	    if(count == 0)
	        return true;
	    else
	        return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
