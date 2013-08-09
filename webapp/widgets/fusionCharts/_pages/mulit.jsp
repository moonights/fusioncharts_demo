<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="com.freecharts.ProvideCharts"%>
<HTML>
	<HEAD>
		<TITLE>FusionCharts Free - Array Example using Combination Column 3D Line Chart</TITLE>
		<SCRIPT LANGUAGE="Javascript" SRC="../../charts/js/FusionCharts.js"></SCRIPT>
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
			//pcharts.setSubcaption("副标题");
			pcharts.setDecimalPrecision("1");
			pcharts.setFormatNumberScale("1");
			pcharts.setXAxisName("x 轴名称");
			pcharts.setShowName("1");
			String strXML=pcharts.createMultiXml();			
		 %>
	</HEAD>
	<BODY>
		<CENTER>
			<div id="chartdiv5">
				this is mscolumn3D !
			</div>
			<script type="text/javascript">
				  var myChart = new FusionCharts("<%=imgpath%>/charts/swfs/FCF_MSColumn3D.swf","myChartid","600","500");
				  myChart.setDataXML("<%=strXML%>");
				  myChart.render("chartdiv5");
			</script>
		</CENTER>
	</BODY>
</HTML>
