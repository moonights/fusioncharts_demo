package com.catsic.widgets.fusioncharts;

import java.util.ArrayList;
import java.util.List;

import com.catsic.widgets.fusioncharts.helper.ColorHelper;
import com.catsic.widgets.fusioncharts.helper.StringUtils;


/** 
 * 类说明 
 * @version V1.0  创建时间：Jan 11, 2010 12:47:49 PM 
 * 类作用描述：提供对外产生 xmldata 的类
 */
public class ProvideCharts {	
	    private static ProvideCharts instance;
	    private String  caption;    //图标的标题
	    private String  subcaption; //子标题
 	    private String  xAxisName;  //X轴标签
	    private String  yAxisName;  //y轴标签
	    private String  showName;   //
	    private String  showValues;   //
	    private String  decimalPrecision; //指定小数的位数 
	    private String  formatNumberScale;// 自动格式化 ，如果 formatNumberScale 的值设置为0，那么 value=12500 就会显示成 12,500 自动添加千位分隔符 
	    private String  decimalSeparator;//小数分隔符 .
	    private String  thousandSeparator;//千位分割符 , 一般用 ，
	    private String  numberPrefix; //前缀
	    private String  numberSuffix; //后缀
	    private String  bgColor; //背景色
	    /***增加的几个属性****/
	    private String  baseFont; //图表字体样式
	    private String  baseFontSize; //图表字体大小
	    private String  baseFontColor; //图表字体颜色
	    private String  chartLeftMargin; //图表边距
	    private String  chartRightMargin; //图表边距
	    private String  chartTopMargin; //图表边距
	    private String  chartBottomMargin; //图表边距 
	    private String  palette;			//
	    private String  useRoundEdges="1";	//  
	    private String  legendBorderAlpha="0";	
	    private String  imageSave="1";
	    private String  imageSaveURL="../../FusionChartsSave.jsp";

	    /**
	     * v3下的新属性（设置后必须使用V3 下的swf模板）
	     */
//	  V3版本下的可以设置为chart,使用方法是 provideCharts.setHeadString("chart");,否则默认是 free版本下的graph
	    private String 	headString="graph";
//	  V3下使用label代替name,使用方法是 provideCharts.setLabel("label");,否则默认是 free版本下的name起作用
		private String  label;
	   
		/****
		 * 默认的样式
		 */
		public ProvideCharts(){
			this.palette="2";
			this.useRoundEdges="1";
			this.legendBorderAlpha="0";
		}
		public String getPalette() {
			return palette;
		}

		public void setPalette(String palette) {
			this.palette = palette;
		}

		public String getBaseFont() {
			return baseFont;
		}

		public void setBaseFont(String baseFont) {
			this.baseFont = baseFont;
		}

		public String getBaseFontSize() {
			return baseFontSize;
		}

		public void setBaseFontSize(String baseFontSize) {
			this.baseFontSize = baseFontSize;
		}

		public static ProvideCharts getInstance(){
	    	   if(instance == null)
	    		   return new ProvideCharts();
	    	   return instance;
	    }

		public String getCaption() {
			return caption;
		}
	
		/**
		 * 设置主标题
		 * @param caption
		 */
		public void setCaption(String caption) {
			this.caption = caption;
		}
	
		public String getXAxisName() {
			return xAxisName;
		}
	
		/**
		 * 设置x轴的标签
		 * @param axisName
		 */
		public void setXAxisName(String axisName) {
			xAxisName = axisName;
		}
	
		public String getYAxisName() {
			return yAxisName;
		}
	
		/**
		 * 设置y轴标签
		 * @param axisName
		 */
		public void setYAxisName(String axisName) {
			yAxisName = axisName;
		}
	
		public String getShowName() {
			return showName;
		}
	
		/**
		 * 是否显示标题名称 0 表示否 1 表示显示
		 * @param showName
		 */
		public void setShowName(String showName) {
			this.showName = showName;
		}
	
		public String getDecimalPrecision() {
			return decimalPrecision;
		}
	
		/**
		 * 指定小数的位数  ,如果设置为0那么像12.432 就变成12 ，
		 * 如果把它设置为5那么就变成 12.43200
		 * @param decimalPrecision
		 */
		public void setDecimalPrecision(String decimalPrecision) {
			this.decimalPrecision = decimalPrecision;
		}
	
		public String getFormatNumberScale() {
			return formatNumberScale;
		}
		/**
		 * 设置是否自动格式化 
		 * FCF 会自动给你的数据添加上 k（千）或M（百万），如果你不想这样，就要把 formatNumberScale 设置为0
		 * @param formatNumberScale
		 */
		public void setFormatNumberScale(String formatNumberScale) {
			this.formatNumberScale = formatNumberScale;
		}
	
		
		public String getNumberPrefix() {
			return numberPrefix;
		}
	    /**
	     * 如果设置 numberPrefix = ‘$’ 那么就会在数字的前面加上"$",像$4000这样
	     * 用%A5 表示 ￥ 
	     * @param numberPrefix
	     */
		public void setNumberPrefix(String numberPrefix) {
			this.numberPrefix = numberPrefix;
		}
	
		public String getSubcaption() {
			return subcaption;
		}

		/**
		 * 设置副标题
		 * @param subcaption
		 */
		public void setSubcaption(String subcaption) {
			this.subcaption = subcaption;
		}

		public String getNumberSuffix() {
			return numberSuffix;
		}
        /**
         * 如果设置 numberSuffix ='25%' 那么获得的结果就是像 43% , 66%
         * 这里的 25% 代表 %
         * @param numberSuffix
         */
		public void setNumberSuffix(String numberSuffix) {
			this.numberSuffix = numberSuffix;
		}

		public String getDecimalSeparator() {
			return decimalSeparator;
		}

		/**
		 * 设置小数分隔符
		 * @param decimalSeparator
		 */
		public void setDecimalSeparator(String decimalSeparator) {
			this.decimalSeparator = decimalSeparator;
		}

		public String getThousandSeparator() {
			return thousandSeparator;
		}

		/**
		 * 设置千位分割符
		 * @param thousandSeparator
		 */
		public void setThousandSeparator(String thousandSeparator) {
			this.thousandSeparator = thousandSeparator;
		}

		public String getBgColor() {
			return bgColor;
		}

	    /**
	     * 设置画布的背景颜色
	     * @param bgColor
	     */
		public void setBgColor(String bgColor) {
			this.bgColor = bgColor;
		}
	   
		
		/**
		 * 
		 */
		
		public String careateHeard(){
			
			StringBuffer stb = new StringBuffer();
			stb.append("<");			
			if(!StringUtils.isString(this.getHeadString())){
				stb.append(headString);
			}else {
				stb.append("graph");
			}
			if(!StringUtils.isString(this.palette)){
				stb.append(" palette='"+this.palette+"'");
			}
			if(!StringUtils.isString(this.caption)){
				stb.append(" caption='"+this.caption+"'");
			}
			
			if(!StringUtils.isString(this.subcaption)){
				stb.append(" subcaption='"+this.subcaption+"'");
			}

			if(!StringUtils.isString(this.xAxisName)){
				stb.append(" xAxisName='"+this.xAxisName+"'");
			}
			
			if(!StringUtils.isString(this.yAxisName)){
				stb.append(" yAxisName='"+this.yAxisName+"'");
			}
			
			if(!StringUtils.isString(this.showName)){
				stb.append(" showName='"+this.showName+"'");
			}
			
			if(!StringUtils.isString(this.decimalPrecision)){
				stb.append(" decimalPrecision='"+this.decimalPrecision+"'");
			}
			
			if(!StringUtils.isString(this.formatNumberScale)){
				stb.append(" formatNumberScale='"+this.formatNumberScale+"'");
			}
			
			if(!StringUtils.isString(this.numberPrefix)){
				stb.append(" numberPrefix='"+this.numberPrefix+"'");
			}
			
			if(!StringUtils.isString(this.numberSuffix)){
				stb.append(" numberSuffix='"+this.numberSuffix+"'");
			}
			
			if(!StringUtils.isString(this.bgColor)){
				stb.append(" bgColor='"+this.bgColor+"'");
			}
			
			if(!StringUtils.isString(this.baseFont)){
				stb.append(" baseFont='"+this.baseFont+"'");
			}
			
			if(!StringUtils.isString(this.baseFontSize)){
				stb.append(" baseFontSize='"+this.baseFontSize+"'");
			}
			
			if(!StringUtils.isString(this.baseFontColor)){
				stb.append(" baseFontColor='"+this.baseFontColor+"'");
			}
			if(!StringUtils.isString(this.chartLeftMargin)){
				stb.append(" chartLeftMargin='"+this.chartLeftMargin+"'");
			}

			if(!StringUtils.isString(this.chartRightMargin)){
				stb.append(" chartRightMargin='"+this.chartRightMargin+"'");
			}

			if(!StringUtils.isString(this.chartTopMargin)){
				stb.append(" chartTopMargin='"+this.chartTopMargin+"'");
			}

			if(!StringUtils.isString(this.chartBottomMargin)){
				stb.append(" chartBottomMargin='"+this.chartBottomMargin+"'");
			}
			if(!StringUtils.isString(this.chartBottomMargin)){
				stb.append(" chartBottomMargin='"+this.chartBottomMargin+"'");
			}
			if(!StringUtils.isString(this.useRoundEdges)){
				stb.append(" useRoundEdges='"+this.useRoundEdges+"'");
			}
			
			if(!StringUtils.isString(this.legendBorderAlpha)){
				stb.append(" legendBorderAlpha='"+this.legendBorderAlpha+"'");
			}
			
			if(!StringUtils.isString(this.imageSave)){
				stb.append(" imageSave='"+this.imageSave+"'");
			}
			if(!StringUtils.isString(this.imageSaveURL)){
				stb.append(" imageSaveURL='"+this.imageSaveURL+"'");
			}
			if(!StringUtils.isString(this.showValues)){
				stb.append(" showValues='"+this.showValues+"'");
			}
			stb.append(">");
			
			return stb.toString();
		}
		
		public String createFoot(){
			String footString="";
			if(!StringUtils.isString(this.getHeadString())){
				footString="</"+this.getHeadString()+">";
			}else {
				footString="</graph>";
			}
			return footString;
		
		}
		
		/**
		 * 产生 单个图形的xml数据
		 * @return
		 */
		public String createXMLDataSingle(List<SingleChart> list){
			
			StringBuffer stb = new StringBuffer();
			stb.append(careateHeard());
			if(list!=null){
				for(SingleChart chart : list){
					stb.append("<set ");
					
					/*if(!StringUtils.isString(this.getHeadString())&&this.getHeadString().equals("chart")){
						stb.append("lable='"+chart.getName()+"' ");		
					}else{
						stb.append("name='"+chart.getName()+"' ");							
					}*/
					
					if(!StringUtils.isString(this.getLabel())&&this.getLabel().equals("label")){
						stb.append("label='"+chart.getName()+"' ");		
					}else{
						stb.append("name='"+chart.getName()+"' ");							
					}
					/*stb.append("name='"+chart.getName()+"' ");*/
					stb.append("value='"+chart.getValue()+"' " );							
					if(!StringUtils.isString(chart.getColor())){
						stb.append("color='"+chart.getColor()+"' ");
					}									
					if(!StringUtils.isString(chart.getLink())){
						stb.append(" link='"+chart.getLink()+"'");
					}
					stb.append("/>");
				}
			}
			
			stb.append(createFoot());			
			//System.out.println(stb.toString());
			return stb.toString();
		}
		
		
		/**
		 * 产生多个
		 * @param list
		 * @return
		 */
		private List<String> categories; //基本分类名称
		
		public List<String> getCategories() {
			return categories;
		}

		public void setCategories(List<String> categories) {
			this.categories = categories;
		}

		private String createCategories(List<String> categories){
			    StringBuffer stb = new StringBuffer();
			    stb.append("<categories>");
			    
			    for(String  name : categories){
			    	  stb.append("<category  name='");
			    	  stb.append(name);
			    	  stb.append("' />");
			    }
			    
			    
			    stb.append("</categories>");
			    
			    return stb.toString();
		}
		public String createXMLDataMulti(List<String> categories , List<MultiChart> list){
			StringBuffer stb = new StringBuffer();
			stb.append(careateHeard());
			stb.append(createCategories(categories));
			
			if(list!=null){
				for(MultiChart chart : list){
					stb.append("<dataset seriesName='"+chart.getName()+"' color='"+chart.getColor()+"'>");
					List<String> values = chart.getValues();
					for(String value : values){
						  stb.append("<set value='"+value+"' />");
					}
					stb.append("</dataset>");
				}
			}
			
			stb.append(createFoot());
			
			return stb.toString();
		}
		
		
		public String createMultiXml(){
			
			List<String> categories = new ArrayList<String>();
			categories.add("product A");
			categories.add("product B");
			categories.add("product C");
			categories.add("product D");
			categories.add("product E");
			categories.add("product F");
			categories.add("product G");
			
			List<MultiChart> multicharts = new ArrayList<MultiChart>();
			for(int i=1 ;i<7 ;i++){
				MultiChart chart = new MultiChart();
				 if(i==1){
					   chart.setName("Current Year");
					   chart.setColor(ColorHelper.getColor());
					   List<String> values = new ArrayList<String>();
					   for(int count = 0;count<6;count++){
						       String s = Math.random()*10000+"";
						       values.add(s.substring(0,s.indexOf(".")));
					   }
					   chart.setValues(values);
				 }
				 if(i==2){
					 chart.setName("Previous Year");
					   chart.setColor(ColorHelper.getColor());
					   List<String> values = new ArrayList<String>();
					   for(int count = 0;count<6;count++){
						       String s = Math.random()*1000+"";
						       values.add(s.substring(0,s.indexOf(".")));
					   }
					   chart.setValues(values);
				 }
				 if(i==3){
					 chart.setName("Next Year333");
					   chart.setColor(ColorHelper.getColor());
					   List<String> values = new ArrayList<String>();
					   for(int count = 0;count<6;count++){
						       String s = Math.random()*1000+"";
						       values.add(s.substring(0,s.indexOf(".")));
					   }
					   chart.setValues(values);
				 }
				 if(i==4){
					 chart.setName("Next Year444");
					 chart.setColor(ColorHelper.getColor());
					 List<String> values = new ArrayList<String>();
					 for(int count = 0;count<6;count++){
						 String s = Math.random()*1000+"";
						 values.add(s.substring(0,s.indexOf(".")));
					 }
					 chart.setValues(values);
				 }
				 if(i==5){
					 chart.setName("Next Year555");
					 chart.setColor(ColorHelper.getColor());
					 List<String> values = new ArrayList<String>();
					 for(int count = 0;count<6;count++){
						 String s = Math.random()*1000+"";
						 values.add(s.substring(0,s.indexOf(".")));
					 }
					 chart.setValues(values);
				 }
				 if(i==6){
					 chart.setName("Next Year6666");
					 chart.setColor(ColorHelper.getColor());
					 List<String> values = new ArrayList<String>();
					 for(int count = 0;count<6;count++){
						 String s = Math.random()*1000+"";
						 values.add(s.substring(0,s.indexOf(".")));
					 }
					 chart.setValues(values);
				 }
				 
				 multicharts.add(chart);
			}
			
			
			String str = createXMLDataMulti(categories, multicharts);
			//System.out.println(str);
			return str;
		}
		
		
		public static void main(String args[]){
			   ProvideCharts pc = new ProvideCharts();
			   pc.createMultiXml();
		}

		public String getBaseFontColor() {
			return baseFontColor;
		}

		public void setBaseFontColor(String baseFontColor) {
			this.baseFontColor = baseFontColor;
		}

		public String getChartBottomMargin() {
			return chartBottomMargin;
		}

		public void setChartBottomMargin(String chartBottomMargin) {
			this.chartBottomMargin = chartBottomMargin;
		}

		public String getChartLeftMargin() {
			return chartLeftMargin;
		}

		public void setChartLeftMargin(String chartLeftMargin) {
			this.chartLeftMargin = chartLeftMargin;
		}

		public String getChartRightMargin() {
			return chartRightMargin;
		}

		public void setChartRightMargin(String chartRightMargin) {
			this.chartRightMargin = chartRightMargin;
		}

		public String getChartTopMargin() {
			return chartTopMargin;
		}

		public void setChartTopMargin(String chartTopMargin) {
			this.chartTopMargin = chartTopMargin;
		}

		public String getHeadString() {
			return headString;
		}

		public void setHeadString(String headString) {
			this.headString = headString;
		}

		public String getUseRoundEdges() {
			return useRoundEdges;
		}

		public void setUseRoundEdges(String useRoundEdges) {
			this.useRoundEdges = useRoundEdges;
		}

		public String getLabel() {
			return label;
		}

		public void setLabel(String label) {
			this.label = label;
		}

		public String getShowValues() {
			return showValues;
		}

		public void setShowValues(String showValues) {
			this.showValues = showValues;
		}

		public String getLegendBorderAlpha() {
			return legendBorderAlpha;
		}

		public void setLegendBorderAlpha(String legendBorderAlpha) {
			this.legendBorderAlpha = legendBorderAlpha;
		}	   
	   
}
