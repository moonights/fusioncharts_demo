<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="widgets/fusionCharts/include/FusionCharts.jsp"%>
<%@page import="com.catsic.widgets.fusioncharts.ProvideCharts"%>
<%@page import="com.catsic.widgets.fusioncharts.SingleChart"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.catsic.widgets.fusioncharts.helper.ColorHelper"%>
<HTML>
	<HEAD>
		<TITLE> Column 3D Line Chart</TITLE>
			
		<SCRIPT LANGUAGE="Javascript" SRC="widgets/fusionCharts/js/FusionCharts.js"></SCRIPT>
		<style type="text/css">
			<!--
				body {
					font-family: Arial, Helvetica, sans-serif;
					font-size: 12px;
				}
			-->
		</style>
		<%
			String imgpath = request.getContextPath();
			ProvideCharts pcharts = ProvideCharts.getInstance();
			pcharts.setCaption("中国111111");
			pcharts.setSubcaption("副标题");
			pcharts.setHeadString("graph");
			pcharts.setFormatNumberScale("0");//是否自动格式化	
			pcharts.setBaseFontSize("12");
			pcharts.setCaption("测试");
			pcharts.setPalette("2");
			pcharts.setDecimalPrecision("0");
			pcharts.setFormatNumberScale("0");
			pcharts.setXAxisName("x 轴名称");
			pcharts.setShowName("1");
			pcharts.setBgColor("F6BD0F");
			
			List<SingleChart> list = new ArrayList<SingleChart>();
			
			for(int i=0;i<8;i++){
			    SingleChart sc = new SingleChart();
			    //sc.setColor(ColorHelper.getColor());
			    sc.setName("junle"+i);
			    String s = Math.random()*1000+"";
			    s.substring(0,s.indexOf("."));
			    sc.setValue(s);
			    list.add(sc);
			}
			
			String strXML=pcharts.createXMLDataSingle(list);
			System.out.println("xml:"+strXML);
		 %>
	</HEAD>
	<BODY>
		<CENTER>
		Column3D
		<%
		 	String chartHTMLCode=createChartHTML(imgpath+"/widgets/fusionCharts/swfs/v3/Column3D.swf", strXML, "", "myFirst", 600, 300, false) ;
		System.out.println("chartHTMLCode:"+chartHTMLCode);
		%>
		   <%=chartHTMLCode%>
			<div id="chartdiv1">this is Pie3D !</div>
			
			<script type="text/javascript">
				  var myChart = new FusionCharts("<%=imgpath%>/widgets/fusionCharts/swfs/v3/Pie3D.swf","myChartid","400","400");
				  myChart.setDataXML("<%=strXML%>");
				  myChart.render("chartdiv1");
			</script>

			<div id="chartdiv2"> this is line !</div>
			<script type="text/javascript">
				  var myChart = new FusionCharts("<%=imgpath%>/widgets/fusionCharts/swfs/v3/Line.swf","myChartid","600","500");
				  myChart.setDataXML("<%=strXML%>");
				  myChart.render("chartdiv2");
			</script>

			<div id="chartdiv3">this is Column3D</div>
			<script type="text/javascript">
				  var myChart = new FusionCharts("<%=imgpath%>/widgets/fusionCharts/swfs/v3/Column3D.swf","myChartid","600","500");
				  myChart.setDataXML("<%=strXML%>");
				  myChart.render("chartdiv3");
			</script>
			
			<div id="chartdiv2d">this is chartdiv2d</div>
			<script type="text/javascript">
				  var myChart = new FusionCharts("<%=imgpath%>/widgets/fusionCharts/swfs/v3/Column2D.swf","myChartid","600","500");
				  myChart.setDataXML("<%=strXML%>");
				  myChart.render("chartdiv2d");
			</script>
			
			<div id="chartdivArea2D">this is area2D !</div>
			<script type="text/javascript">
				  var myChart = new FusionCharts("<%=imgpath%>/widgets/fusionCharts/swfs/v3/Area2D.swf","myChartid","600","500");
				  myChart.setDataXML("<%=strXML%>");
				  myChart.render("chartdivArea2D");
			</script>
		</CENTER>
	</BODY>
</HTML>
