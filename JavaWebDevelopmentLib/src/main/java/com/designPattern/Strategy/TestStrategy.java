package com.designPattern.Strategy;

import javax.swing.text.PlainDocument;

public class TestStrategy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OneAction action = new OneAction();
		
		Play play1 = new Square();
		Play play2 = new Tran();
		
		action.setPlay(play1);
		action.proformAction();
		
		action.setPlay(play2);
		action.proformAction();
		
		
	}

}
