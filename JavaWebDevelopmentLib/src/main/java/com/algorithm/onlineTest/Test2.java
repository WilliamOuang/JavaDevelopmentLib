package com.algorithm.onlineTest;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.algorithm.onlineTest.Test1.Portfoio;




public class Test2 {
	  private Transaction inner = null;
	  public Transaction getInnerInstance() {
	        if(inner == null)
	            inner = new Transaction();
	        return inner;
	    }
	class Transaction implements Comparable<Transaction> {
		
		@Override
		public int compareTo(Transaction portfoio) {
			return this.ticker.compareTo(portfoio.getTicker());
		
		}
		private String action;
		public String getAction() {
			return action;
		}
		public void setAction(String action) {
			this.action = action;
		}
		private String name;
		private String ticker;
		private Double quantity;	
		
		public Double getQuantity() {
			return quantity;
		}
		public void setQuantity(Double quantity) {
			this.quantity = quantity;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getTicker() {
			return ticker;
		}
		public void setTicker(String ticker) {
			this.ticker = ticker;
		}

		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(generateTransactions("VOD,Vodafone,10|GOOG,Google,15|MSFT,Microsoft,12:VOD,Vodafone,16|GOOG,Google,10|MSFT,Microsoft,25"));
		
	}
    public static final String PIPE = "|";
    static String generateTransactions(String input) {
    	String arr[] = input.split(":");
    	String arr0[] = arr[0].split("\\"+PIPE);
    	String arr1[] = arr[1].split("\\"+PIPE);

    	List<Transaction> portfoio=new ArrayList<>();
		for(int i = 0;i < arr0.length; i++){
			String portfoioarr[] = arr0[i].split(",");
			Test2 outter = new Test2();
			Test2.Transaction p=outter.getInnerInstance();
			p.setTicker(portfoioarr[0]);
			p.setName(portfoioarr[1]);
			DecimalFormat df  = new DecimalFormat( "#####0.00 ");      
            System.out.println(df.format(Double.valueOf(portfoioarr[2]).doubleValue()));    
			p.setQuantity(Double.valueOf(portfoioarr[2]).doubleValue());
			portfoio.add(p);
		
		}
		List<Transaction> bench=new ArrayList<>();
		for(int i = 0;i < arr1.length; i++){
			String portfoioarr[] = arr1[i].split(",");
			Test2 outter = new Test2();
			Test2.Transaction p=outter.getInnerInstance();
			p.setTicker(portfoioarr[0]);
			p.setName(portfoioarr[1]);
			p.setQuantity(Double.valueOf(portfoioarr[2]).doubleValue());
			bench.add(p);
		
		}
		 Collections.sort(portfoio);
		 Collections.sort(bench);
		 String retString="";
		 for(int k=0;k<portfoio.size();k++){
			 Transaction p1=portfoio.get(k);
			 Transaction b1=bench.get(k);
			 if(p1.getQuantity()>b1.getQuantity()){
				 retString+="["+"Sell"+", "+p1.getTicker()+", "+p1.getQuantity()+"]";
			 }else{
				 retString+="["+"Buy"+", "+p1.getName()+", "+p1.getQuantity()+"]";
			 }
			 if(k!=portfoio.size()-1){
			 retString+=", ";
			 }

			 }
				 
		 
    	return retString;
    }

}
