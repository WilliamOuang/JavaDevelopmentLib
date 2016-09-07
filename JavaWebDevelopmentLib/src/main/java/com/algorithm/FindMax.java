package com.algorithm;

public class FindMax {

	// 返回最大值的方法
			public int returnMax(int array[]) {
				int length = array.length;
				int first;
				int second;
				if (length == 1) {
					return array[0];
				} else if (length == 2) {
					return Math.max(array[0], array[1]);
				} else if (length < 1) {
					return 0;
				} else {   //这里将一个数组一分为二，然后各个求解
					first = length / 2;
					second = length - length / 2;
					int firstArray[] = new int[first];
					int secondArray[] = new int[second];
					for (int i = 0; i < first; i++) {
						firstArray[i] = array[i];
					}
					for (int j = first; j < length; j++) {
						secondArray[j - first] = array[j];
					}
					return Math.max(returnMax(firstArray), returnMax(secondArray));
				}
			}

			public static void main(String[] args) {

				FindMax findMax = new FindMax();
				int array[] = { 5, 12, 1, 36, 9, 10001, 14, 30, 21, 56,80,12,33,1000};
				long start = System.currentTimeMillis();
				int max = findMax.returnMax(array);
				long end = System.currentTimeMillis();
				System.out.println("这个数组中的最大值是:" + max);
				System.out.println("本次查找耗时: " + (end - start) + " ms");
			}

	


	
}
