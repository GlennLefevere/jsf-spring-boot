package de.beyondjava.charts;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class PieChart implements Serializable {
	private static final long serialVersionUID = 1L;

	private String id;
	private String type = "pie";
	private PieData data = new PieData();
	private PieOptions options;

	public PieChart(Map<String, Number> data) {
		List<String> labels = new ArrayList<>();
		List<Number> values = new ArrayList<>();
		data.keySet().forEach(k -> {
			labels.add(k);
			values.add(data.get(k));
		});

		this.data.setLabels(labels);

		PieDataset set = new PieDataset();
		set.setData(values);

		this.data.setDatasets(Arrays.asList(set));
		options = new PieOptions();
	}

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getTitle() {
		return getOptions().getTitle().getText();
	}
	
	public void setTitle(String title) {
		getOptions().getTitle().setText(title);
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public PieData getData() {
		return data;
	}

	public void setData(PieData data) {
		this.data = data;
	}
	
	public PieOptions getOptions() {
		return options;
	}
	
	public void setOptions(PieOptions options) {
		this.options = options;
	}

}
