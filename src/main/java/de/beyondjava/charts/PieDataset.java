package de.beyondjava.charts;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public class PieDataset implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private List<Number> data;
	private List<String> backgroundColor = Arrays.asList("#36A2EB","#FFCE56");
	private List<String> hoverBackgroundColor = Arrays.asList("#36A2EB","#FFCE56");
	
	public List<Number> getData() {
		return data;
	}
	public void setData(List<Number> data) {
		this.data = data;
	}
	public List<String> getBackgroundColor() {
		return backgroundColor;
	}
	public void setBackgroundColor(List<String> backgroundColor) {
		this.backgroundColor = backgroundColor;
	}
	public List<String> getHoverBackgroundColor() {
		return hoverBackgroundColor;
	}
	public void setHoverBackgroundColor(List<String> hoverBackgroundColor) {
		this.hoverBackgroundColor = hoverBackgroundColor;
	}

}
