package com.catsic.widgets.fusioncharts.helper;
/**
 * 
 * @author moonights
 * @version 1.0
 * @file ColorHelper.java
 * @date Jan 11, 2010 
 * @time 12:47:49 PM 
 * @TODO /** 类作用描述：颜色的辅助类
 */
public class ColorHelper {
	
	  /**
	   * 随机获得颜色
	   * @return
	   */
	   public static String getColor(){
		    StringBuffer stb = new StringBuffer();
			for(int i=0;i<6;i++){
				String s = (Math.random()*16)+"";
				String indexStr = s.substring(0,s.indexOf("."));
				
				if(indexStr.equals("10")){
					stb.append("A");
				}else
				if(indexStr.equals("11")){
					stb.append("B");
				}else
				if(indexStr.equals("12")){
					stb.append("C");
				}else
				if(indexStr.equals("13")){
					stb.append("D");
				}else
				if(indexStr.equals("14")){
					stb.append("E");
				}else
				if(indexStr.equals("15")){
					stb.append("F");
				}else{
					stb.append(indexStr);
				}
			}
			
//			System.out.println(stb.toString());
			return stb.toString();
	   }
	   
	   public static void main(String args[]) {
		     // System.out.println(ColorHelper.getColor());   
	   }
}
