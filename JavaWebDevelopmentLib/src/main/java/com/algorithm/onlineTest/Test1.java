package com.algorithm.onlineTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Test1 {
	  private Portfoio inner = null;
	  public Portfoio getInnerInstance() {
	        if(inner == null)
	            inner = new Portfoio();
	        return inner;
	    }
	class Portfoio implements Comparable<Portfoio> {
		
		@Override
		public int compareTo(Portfoio portfoio) {
			return this.ticker.compareTo(portfoio.getTicker());
		}	
		private String name;
		private String ticker;
		private int quantity;	
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
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
		System.out.println(printHoldings("VOD,vod,10|Good,aa,20|Msft,Microsoft,12"));
		
	}
    public static final String PIPE = "|";

	 static String printHoldings(String portfolioString) {
			String arr[] = portfolioString.split("\\"+PIPE);
			List<Portfoio> portfoio=new ArrayList<>();
			for(int i = 0;i < arr.length; i++){
				String portfoioarr[] = arr[i].split(",");
				Test1 outter = new Test1();
				Test1.Portfoio p=outter.getInnerInstance();
				p.setTicker(portfoioarr[0]);
				p.setName(portfoioarr[1]);
				p.setQuantity(Integer.valueOf(portfoioarr[2]));
				portfoio.add(p);
			
			}
			 Collections.sort(portfoio);
			 String retString="";
			 for(int k=0;k<portfoio.size();k++){
				 Portfoio p1=portfoio.get(k);
				 retString+="["+p1.getTicker()+","+p1.getName()+","+p1.getQuantity()+"]";
				 if(k!=portfoio.size()-1){
					 retString+=",";
				 }
			 }
			 return retString;

	 }


}
