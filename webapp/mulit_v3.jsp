<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="com.catsic.widgets.fusioncharts.ProvideCharts"%>
<%@page import="com.catsic.widgets.fusioncharts.SingleChart"%>
<%@page import="com.catsic.widgets.fusioncharts.helper.ColorHelper"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<HTML>
	<HEAD>
		<TITLE>FusionCharts Free - Array Example using Combination Column 3D Line Chart</TITLE>
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
			pcharts.setHeadString("graph");
			pcharts.setCaption("测试111111");
			//pcharts.setSubcaption("副标题");
			pcharts.setDecimalPrecision("1");
			pcharts.setFormatNumberScale("1");
			pcharts.setXAxisName("x 轴名称");
			pcharts.setShowName("1");
			String strXML=pcharts.createMultiXml();
			
			System.out.println("xml:"+strXML);
			
		 %>
	</HEAD>
	<BODY>
		<CENTER>
			<div id="chartdiv5">
				this is mscolumn3D !
			</div>
			<script type="text/javascript">
				  var myChart = new FusionCharts("<%=imgpath%>/widgets/fusionCharts/swfs/v3/MSColumn3D.swf","myChartid","600","500");
				  myChart.setDataXML("<%=strXML%>");
				  myChart.render("chartdiv5");
			</script>
			
			<div id="chartdiv6">
				this is FCF_MSBar2D !
			</div>
			<script type="text/javascript">
				  var myChart = new FusionCharts("<%=imgpath%>/widgets/fusionCharts/swfs/v3/MSBar2D.swf","myChartid","600","500");
				  myChart.setDataXML("<%=strXML%>");
				  myChart.render("chartdiv6");
			</script>

			<div id="chartdiv7">
				this is mscolumn2D !
			</div>
			<script type="text/javascript">
				  var myChart = new FusionCharts("<%=imgpath%>/widgets/fusionCharts/swfs/v3/MSColumn2D.swf","myChartid","1200","500");
				 myChart.setDataXML("<%=strXML%>");
				  myChart.render("chartdiv7");
			</script>

			<div id="chartdiv8">
				this is FCF_MSLine.swf !
			</div>
			<script type="text/javascript">
				  var myChart = new FusionCharts("<%=imgpath%>/widgets/fusionCharts/swfs/v3/MSLine.swf","myChartid","1200","500");
				  myChart.setDataXML("<%=strXML%>");
				  myChart.render("chartdiv8");
			</script>
			
		</CENTER>
	</BODY>
</HTML>
