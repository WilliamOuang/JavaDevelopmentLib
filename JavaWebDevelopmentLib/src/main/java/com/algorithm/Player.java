package com.algorithm;

import java.util.Arrays;

public class Player {
	 String name;
	    int score;
	    
	    Player(String name, int score){
	        this.name = name;
	        this.score = score;
	    }
	    
	    public static void main(String[] args) {
	    	Player p1= new Player("a", 20);
	    	Player p2= new Player("william", 30);
	    	Player p4= new Player("b", 20);

	    	
	    	Player[] arr= new Player[]{p1,p2,p4};
	    	 for(int i = 0; i < arr.length; i++){
	             System.out.printf("%s %s\n", arr[i].name, arr[i].score);
	         }
	    	Arrays.sort(arr, new Checker());
	    	 for(int i = 0; i < arr.length; i++){
	             System.out.printf("%s %s\n", arr[i].name, arr[i].score);
	         }
		}
}
