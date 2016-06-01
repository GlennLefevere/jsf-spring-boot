package de.beyondjava.charts;

import java.io.Serializable;

public class PieOptions implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private PieTitleOptions title = new PieTitleOptions();
	private PieLegendOptions legend = new PieLegendOptions();
	
	public PieTitleOptions getTitle() {
		return title;
	}
	
	public void setTitle(PieTitleOptions title) {
		this.title = title;
	}
	
	public PieLegendOptions getLegend() {
		return legend;
	}
	
	public void setLegend(PieLegendOptions legend) {
		this.legend = legend;
	}
}
