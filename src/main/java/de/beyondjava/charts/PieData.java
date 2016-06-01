package de.beyondjava.charts;

import java.io.Serializable;
import java.util.List;

public class PieData implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private List<String> labels;
	private List<PieDataset> datasets;
	
	public List<String> getLabels() {
		return labels;
	}
	public void setLabels(List<String> labels) {
		this.labels = labels;
	}
	public List<PieDataset> getDatasets() {
		return datasets;
	}
	public void setDatasets(List<PieDataset> datasets) {
		this.datasets = datasets;
	}
}
