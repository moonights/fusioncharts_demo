package com.catsic.widgets.fusioncharts;

/**
 * 
 * @author moonights
 * @version 1.0
 * @file SingleChart.java
 * @date Dec 10, 2010
 * @time 9:28:36 AM
 * @TODO 类作用描述： 单个数据图
 */

public class SingleChart {

	private String name; // 名称

	private String value; // 值

	private String color; // 颜色

	private String link; // 链接
	
	private String isSliced;//是否展开切片
	
	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getIsSliced() {
		return isSliced;
	}

	public void setIsSliced(String isSliced) {
		this.isSliced = isSliced;
	}

}
