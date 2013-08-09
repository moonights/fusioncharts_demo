<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="com.freecharts.ProvideCharts"%>
<%@page import="com.freecharts.chartobject.SingleChart"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.catsic.web.helpers.ColorHelper"%>
<HTML>
	<HEAD>
		<TITLE>Chart</TITLE>
		<LINK media=all href="../../css/custom.css" type=text/css rel=stylesheet>
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
			//pcharts.setCaption("按技术等级汇总**路线");
			//pcharts.setSubcaption("副标题");
			pcharts.setDecimalPrecision("0");
			pcharts.setFormatNumberScale("0");
			pcharts.setXAxisName("x 轴名称");
			pcharts.setShowName("1");
			//pcharts.setBgColor("F6BD0F");	
			List<SingleChart> list = new ArrayList<SingleChart>();	
			for(int i=0;i<8;i++){
			    SingleChart sc = new SingleChart();
			    sc.setColor(ColorHelper.getColor());
			    sc.setName("junle"+i);
			    String s = Math.random()*1000+"";
			    s.substring(0,s.indexOf("."));
			    sc.setValue(s);
			    list.add(sc);
			}	
			String strXML=pcharts.createXMLDataSingle(list);
		%>
	</HEAD>
	<BODY>		
		<table style="width:260px;height:260px">
			<tr><td align="center">按技术等级汇总路线</td></tr>
			<tr><td align="center"><div id="chartdiv"></div></td></tr>						
		</table>
		<script type="text/javascript">
		  var myChart = new FusionCharts("<%=imgpath%>/charts/swfs/FCF_Pie3D.swf","myChartid","240","240");
		  myChart.setDataXML("<%=strXML%>");
		  myChart.render("chartdiv");
		</script>
	</BODY>
</HTML>
