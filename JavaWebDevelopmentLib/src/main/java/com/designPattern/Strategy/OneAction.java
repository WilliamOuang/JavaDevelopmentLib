package com.designPattern.Strategy;

public class OneAction {

	private Play play;

	public Play getPlay() {
		return play;
	}

	public void setPlay(Play play) {
		this.play = play;
	}
	
	public void proformAction(){
		this.play.draw();
	}
}
