package com.algorithm.DP;

/** 
 * 获得连续子数组的最大和 
 * @author dfeng 
 * 
 */  
public class MaxSubArraySum {  
  
    private static long getMax(long a, long b) {  
        return a > b ? a : b;  
    }  
    
  static  int MaxSubString(int[] array)
    {
	    int max=Integer.MIN_VALUE;  //初始值为负无穷大
	    int sum;
	    for(int i = 0; i < array.length; i++)
	    {
	    	sum = 0;
		    for(int j = i; j < array.length; j++)
		    {
		    	sum +=array[j];
		    	if(sum > max)
		    		max = sum;
		    }
	    }
   return max;
    }
      
    /** 
     * 获得连续子数组的最大和 
     * @param array 
     * @return 最大和，此处用了Long型是为了表示当参数为null或空时，可以返回null，返回其它任何数字都可能引起歧义。 
     */  
    public static Long getMax(int[] array) {  
          
        if (array == null || array.length <= 0) {  
            return null;  
        }  
          
        long maxSum = array[0]; //所有子数组中最大的和  
        long righteEdge = array[0]; //右侧子数组的最大和  
        for (int i = 1; i < array.length; i++) {  
            //当右侧子数组的最大和为负数时，对于新数组，右侧子数组的最大和为新增加的数。  
            if (righteEdge < 0) {  
                righteEdge = array[i];  
            } else { //为正数时，对于新数组，右侧子数组的最大和为新增加的数 + 原来的最大和。  
                righteEdge += array[i];  
            }  
            //所有子数组中最大的和  
            maxSum = getMax(righteEdge, maxSum);  
        }  
        return maxSum;  
    }  
  
    public static void main(String[] args) {  
       // int[] array = {2,3,-9,6,2};  
        int[] array = {-1,5,-6,5,1,-4};  
        //MaxSubString
//      System.out.println("Max sum: " + MaxSubArraySum.MaxSubString(array));  
//
//       System.out.println("Max sum: " + MaxSubArraySum.getMax(array));  
//        
//        System.out.println("Max sum1: " + MaxSubArraySum.MaxSubValue(array)); 
//
//        System.out.println("Max sum1: " + MaxSubArraySum.MaxSubString1(array)); 
        
        System.out.println("Max sum1: " + MaxSubArraySum.MaxSubString2(array));  



    }  
    
    //DP 2
    static int MaxSubString2(int arr[])
     {
    	 int sum=arr[0];
         int max=arr[0];
        
         
         for(int i=1;i<arr.length;i++){
        	 sum=Math.max(arr[i],sum+arr[i]);
        	max=Math.max(sum, max);
         }
         return max;
     }
    
    //DP 1
   static int MaxSubString1(int arr[])
    {
            int Start = arr[arr.length - 1];
            int All = arr[arr.length - 1];
            for(int i = arr.length - 2; i >= 0; i--)    //从后向前遍历，反之亦可。
            {
                    Start = Math.max( arr[i], arr[i] + Start);
                    All = Math.max(Start, All);
            }
            return All;                       //All[0] 中存放结果
    }
  
    public static int MaxSubValue(int array[]){
    	

//	    int max=Integer.MIN_VALUE;  //初始值为负无穷大
//	    int sum;
//	    for(int i = 0; i < array.length; i++)
//	    {
//	    	sum = 0;
//		    for(int j = i; j < array.length; j++)
//		    {
//		    	sum +=array[j];
//		    	if(sum > max)
//		    		max = sum;
//		    }
//	    }
//    	
    	
    	int max=Integer.MIN_VALUE;
    	
    	for(int i=0;i<array.length;i++){
    		int sum=0;
    		for(int j=i;j<array.length;j++){
    			sum+=array[j];
    			if(sum>max){
        			max=sum;
        		}
    		}
    		
    		
    	}
    	return max;
    	
    }	
}  
