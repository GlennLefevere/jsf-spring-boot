/**
 *  (C) 2013-2014 Stephan Rauh http://www.beyondjava.net
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package de.beyondjava.jsf.sample.searchExpressions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import com.google.gson.Gson;

import de.beyondjava.charts.PieChart;
import de.beyondjava.utils.GsonUtil;

@ManagedBean
@ViewScoped
public class SmallNumberBean {

	private PieChart chart;
	private List<PieChart> charts;

	@PostConstruct
	public void init() {
		Map<String, Number> params = new HashMap<>();
		params.put("neg", 10);
		params.put("pos", 5);
		chart = new PieChart(params);
		chart.setId(FacesContext.getCurrentInstance().getViewRoot().createUniqueId());
		
		Map<String, Number> params1 = new HashMap<>();
		params1.put("neg", 10);
		params1.put("pos", 5);
		PieChart chart1 = new PieChart(params1);
		chart1.setId(FacesContext.getCurrentInstance().getViewRoot().createUniqueId());
		chart1.setTitle("Post 1");
		chart1.getOptions().getLegend().setDisplay(false);
		
		Map<String, Number> params2 = new HashMap<>();
		params2.put("neg", 10);
		params2.put("pos", 36);
		PieChart chart2 = new PieChart(params2);
		chart2.setId(FacesContext.getCurrentInstance().getViewRoot().createUniqueId());
		chart2.setTitle("Post 2");
		chart2.getOptions().getLegend().setDisplay(false);
		
		Map<String, Number> params3 = new HashMap<>();
		params3.put("neg", 12);
		params3.put("pos", 5);
		PieChart chart3 = new PieChart(params3);
		chart3.setId(FacesContext.getCurrentInstance().getViewRoot().createUniqueId());
		chart3.setTitle("Post 3");
		chart3.getOptions().getLegend().setDisplay(false);
		
		Map<String, Number> params4 = new HashMap<>();
		params4.put("neg", 10);
		params4.put("pos", 25);
		PieChart chart4 = new PieChart(params4);
		chart4.setId(FacesContext.getCurrentInstance().getViewRoot().createUniqueId());
		chart4.setTitle("Post 4");
		chart4.getOptions().getLegend().setDisplay(false);
		
		Map<String, Number> params5 = new HashMap<>();
		params5.put("neg", 6);
		params5.put("pos", 8);
		PieChart chart5 = new PieChart(params5);
		chart5.setId(FacesContext.getCurrentInstance().getViewRoot().createUniqueId());
		chart5.setTitle("Post 5");
		
		Map<String, Number> params6 = new HashMap<>();
		params6.put("neg", 3);
		params6.put("pos", 7);
		PieChart chart6 = new PieChart(params6);
		chart6.setId(FacesContext.getCurrentInstance().getViewRoot().createUniqueId());
		chart6.setTitle("Post 6");
		chart6.getOptions().getLegend().setDisplay(false);
		
		charts = new ArrayList<>();
		charts.add(chart1);
		charts.add(chart2);
		charts.add(chart3);
		charts.add(chart4);
		charts.add(chart5);
		charts.add(chart6);
	}
	
	public PieChart getPieChart(){
		return chart;
	}
	
	public List<PieChart> getCharts() {
		return charts;
	}
	
	public void setCharts(List<PieChart> charts) {
		this.charts = charts;
	}

	public String getChart(Object object) {
		return GsonUtil.getGson(object);
	}

}