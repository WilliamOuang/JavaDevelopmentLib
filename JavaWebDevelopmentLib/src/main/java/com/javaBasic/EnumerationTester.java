package com.javaBasic;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class EnumerationTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Enumeration days;
	      Vector dayNames = new Vector();
	      List list= new ArrayList<>();
	      list.add("1");
	     ListIterator listIterator= list.listIterator();
	     Iterator il=list.iterator();
	     while(il.hasNext()){
	    	 System.out.println("===="+il.next());
	     }
	      
	      dayNames.add("Sunday");
	      dayNames.add("Monday");
	      dayNames.add("Tuesday");
	      dayNames.add("Wednesday");
	      dayNames.add("Thursday");
	      dayNames.add("Friday");
	      dayNames.add("Saturday");
	      
	      
	      days = dayNames.elements();
	      while (days.hasMoreElements()){
	         System.out.println(days.nextElement()); 
	      }
	      
	      System.out.println("------------------");
	      
	      List<Integer> list1 = new ArrayList<Integer>();// 创建列表
          for (int i = 0; i < 10; i++) {// 向列表中增加10个元素
              list1.add(i);
          }
          Iterator it = list1.iterator();
          System.out.print("ArrayList集合中的元素为：");
          while(it.hasNext()){
              System.out.print(it.next()+" ");
          }      
          System.out.println();
          System.out.println("逆序后为：");
          
          ListIterator<Integer> li = list1.listIterator();// 获得ListIterator对象
         
          
          for (li = list1.listIterator(); li.hasNext();) {// 将游标定位到列表结尾
              li.next();
              //System.out.println(li.nextIndex());;
          }
        
          for (; li.hasPrevious();) {// 逆序输出列表中的元素
              System.out.print(li.previous() + " ");
          }
	      
	      
	      
	}

}
