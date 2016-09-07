package com.String;

/** 
* User: yanghua 
* Date: 5/11/13 
* Time: 10:54 AM 
* Copyright (c) 2013 yanghua. All rights reserved. 
*/  
 
import java.util.HashMap;  
import java.util.Map;  
 
/** 
* rolling Hash(Rabin-Karp Algorithm)练习 
* 功能：求给定串的anagram 子串 
* 示例：GetAnagram("abcdbcsdaqdbahs","scdcb") --> cdbcs 【Google面试题】 
*/  
public class RollingHash {  
 
 
   //the simple hash calculate expression is : (a[0] + a[1] + a[2]+ .... + a[n]) * FACTOR  
   private static final int FACTOR = 41;  
   private static long hashValueOfPattern;  
 
 
   /** 
    * generate the pattern's hash 
    * 
    * @param patternStr the pattern string 
    */  
   private static void generatePatternHash(String patternStr) {  
       if (null == patternStr || patternStr.isEmpty()) {  
           throw new IllegalArgumentException("the arg:patternStr can not be null or empty");  
       }  
 
       hashValueOfPattern = 0;  
       int sum = 0;  
 
       for (int i = 0; i < patternStr.length(); i++) {  
           char c = patternStr.charAt(i);  
           sum += (int) c;  
       }  
 
       hashValueOfPattern = sum * FACTOR;  
   }  
 
   /** 
    * find the matched anagram-str 
    * 
    * @param searchingStr the searching string 
    * @param patternStr   the pattern for searching string 
    * @return matched count 
    */  
   private static int findAnargamStr(String searchingStr, String patternStr) {  
       if (null == searchingStr || searchingStr.isEmpty()) {  
           throw new IllegalArgumentException("the arg:searchingStr can not be null or empty");  
       }  
 
       if (null == patternStr || patternStr.isEmpty()) {  
           throw new IllegalArgumentException("the arg:patternStr can not be null or empty");  
       }  
 
       if (searchingStr.length() < patternStr.length()) {  
           return 0;  
       }  
 
       int count = 0;  
 
       //generate hashmap and hashvalue  
       generatePatternHash(patternStr);  
       long tmpHashValue = 0;  
 
       int l = patternStr.length();  
       int n = searchingStr.length();  
 
       for (int i = 0; i < n; i++) {  
           char c = searchingStr.charAt(i);  
 
           //calculate the first sub-string (0:pattern.length()-1) which length equal to pattern  
           if (i < l) {  
               tmpHashValue += ((int) c) * FACTOR;  
           } else {  
               //new tmpHashValue: (a[in-index]-a[out-index]) * FACTOR  
               tmpHashValue += ((int) c - (int) searchingStr.charAt(i - l)) * FACTOR;  
 
               //if the hash-value matched, compare each character  
               //注：如果这里采用一个好的hash函数 或者 增大hash 槽 或者给字符串进行hash签名来避免过多的hash碰撞，  
               // 那么这里就可以大大简化对isAnagram的调用，从而使得整个问题的复杂度逼近O(n)  
               if (hashValueOfPattern == tmpHashValue)  
                   if (isAnagram(searchingStr, i - l + 1, i, patternStr))  
                       count++;  
           }  
 
       }  
 
       return count;  
   }  
 
   /** 
    * is the two string anagram （因为哈希碰撞的存在，该函数用于验证字符串是否确实相等） 
    * 
    * @param comparedStr compared string 
    * @param startIndex  start index 
    * @param endIndex    end index 
    * @param pattern     pattern string 
    * @return true / false 
    */  
   private static boolean isAnagram(String comparedStr, int startIndex, int endIndex, String pattern) {  
 
       if (null == comparedStr || comparedStr.isEmpty()) {  
           throw new IllegalArgumentException("the arg:comparedStr can not be null or empty");  
       }  
 
       if (null == pattern || pattern.isEmpty()) {  
           throw new IllegalArgumentException("the arg:pattern can not be null or empty");  
       }  
 
       if (startIndex > endIndex || endIndex - startIndex != pattern.length() - 1) {  
           throw new IllegalArgumentException("the arg:startIndex or endIndex is illegal");  
       }  
 
       boolean anagram = true;  
 
       int[] letterCountOfPattern = new int[256];  
       //not only number and letter , contain backspace and special symbol  
       for (int j = 0; j < 256; j++) {  
           letterCountOfPattern[j] = 0;  
       }  
 
       for (int k = 0; k < pattern.length(); k++) {  
           ++letterCountOfPattern[pattern.charAt(k)];  
       }  
 
       for (int i = startIndex; i <= endIndex; i++) {  
           --letterCountOfPattern[comparedStr.charAt(i)];  
       }  
 
       for (int m = 0; m < 256; m++) {  
           if (letterCountOfPattern[m] != 0) {  
               anagram = false;  
               break;  
           }  
       }  
 
       return anagram;  
   }  
 
 
   public static void main(String[] args) {  
       String searchingStr = "abcdbcsdaqdbahs";  
       String patternStr = "dbc";  
 
       int count=findAnargamStr(searchingStr,patternStr);  
       System.out.println(count);  
   }  
 
}  