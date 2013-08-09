package com.catsic.widgets.fusioncharts;

import java.util.List;

/**
 * @author moonights
 * @version 1.0
 * @file MultiChart.java
 * @date Dec 10, 2010
 * @time 9:27:40 AM
 * @TODO 类作用描述： 多个数据显示在一个图片上
 */
public class MultiChart {
	
	private String name ;  			//名称，显示的名称
    private String color;  			//显示的颜色
    private List<String> values; 	//值
   
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public List<String> getValues() {
		return values;
	}
	public void setValues(List<String> values) {
		this.values = values;
	}
       
       
       
}
