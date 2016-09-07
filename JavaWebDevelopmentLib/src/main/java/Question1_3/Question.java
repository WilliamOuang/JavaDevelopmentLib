package Question1_3;

import java.util.Arrays;

import CareerCupLibrary.*;

public class Question {

	public static void removeDuplicates(char[] str) {
		if (str == null) {
			return;
		}
		int len = str.length;
		if (len < 2) {
			return;
		}
		int tail = 1;
		
		for (int i = 1; i < len; ++i) {
			int j;
			for (j = 0; j < tail; ++j)
				if (str[i] == str[j]) {
					break;
				}
			if (j == tail) {
				str[tail] = str[i];
				++tail;
			}
		}
		//System.out.println(AssortedMethods.charArrayToString(str));

		//System.out.println("tail:"+str[tail]);
		str[tail] = 0;
		//System.out.println(AssortedMethods.charArrayToString(str));

	} 
	
	public static void removeDuplicatesEff(char[] str) {
		if (str == null) return;
		int len = str.length;
		if (len < 2) return;

		boolean[] hit = new boolean[256];
		for (int i = 0; i < 256; ++i) {
			hit[i] = false;
		}
		hit[str[0]] = true;

		int tail = 1;
		for (int i = 1; i < len; ++i) {
			if (!hit[str[i]]) {
				str[tail] = str[i];
				++tail;
				hit[str[i]] = true;
			}
		}
		str[tail] = 0;
	}
	
	public static void main(String[] args) {
		
		String[] sr = new String[]{"1","2","3","4"};
		sr[2]="0";
		System.out.println(Arrays.toString(sr));
		
		String s = "helloiloveyou";
		char[] arr = s.toCharArray();
		arr[3]=0;
		//removeDuplicatesEff(arr);
		//removeDuplicates(arr);
	//removeDuplicateWilliam(arr);
		System.out.print(AssortedMethods.charArrayToString(arr));
	}
	
	public static void removeDuplicateWilliam(char[] arr){
		
		if (arr == null) {
			return;
		}
		int len = arr.length;
		if (len < 2) {
			return;
		}
		
		int end=1;
		for(int i=1;i<len;++i){
			int j=0;
			for(j=0;j<end;++j){
				if(arr[j]==arr[i]){
					break;
				}
			}	
			if(j==end){
					arr[end]=arr[i];
					++end;
			}
			
		}
		arr[end] = 0;
		
		
//		
//		if (str == null) {
//			return;
//		}
//		int len = str.length;
//		if (len < 2) {
//			return;
//		}
//		int tail = 1;
//		
//		for (int i = 1; i < len; ++i) {
//			int j;
//			for (j = 0; j < tail; ++j)
//				if (str[i] == str[j]) {
//					break;
//				}
//			if (j == tail) {
//				str[tail] = str[i];
//				++tail;
//			}
//		}
//	
//		str[tail] = 0;
	}
	
	
	
	

}
