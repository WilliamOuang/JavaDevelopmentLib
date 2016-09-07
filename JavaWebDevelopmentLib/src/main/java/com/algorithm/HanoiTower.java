package com.algorithm;

public class HanoiTower {

	   public static void moveDish(int level, char from, char inter, char to) {
	        if (level == 1) {
	            System.out.println("从" + from + " 移动盘子" + level + " 号到" + to);
	        } else {
	            moveDish(level - 1, from, to, inter);
	            System.out.println("从" + from + " 移动盘子" + level + " 号到" + to);
	            moveDish(level - 1, inter, from, to);
	        }
	    }
	    public static void main(String[] args) {
	        int nDisks = 6;
	        moveDish(nDisks, 'A', 'B', 'C');
	    }

}
