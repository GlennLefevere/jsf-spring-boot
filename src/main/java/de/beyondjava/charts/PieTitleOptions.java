package de.beyondjava.charts;

import java.io.Serializable;

public class PieTitleOptions implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String text;
	private boolean display = true;
	
	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}

	public boolean isDisplay() {
		return display;
	}

	public void setDisplay(boolean display) {
		this.display = display;
	}
	
}
