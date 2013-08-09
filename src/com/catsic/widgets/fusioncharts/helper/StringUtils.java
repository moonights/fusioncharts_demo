package com.catsic.widgets.fusioncharts.helper;
/** 
 * 类说明 
 * @version V1.0  创建时间：Jan 11, 2010 12:47:28 PM 
 * 类作用描述： 字符串操作帮助类
 */
public class StringUtils{
       
	
       /**
        * 判断字符串是否是空串
        * @param str
        * @return
        */	
	   public static boolean isString(String str){
		      if(null == str || str.length() == 0){
		    	  return true;
		      }
		      return false;
	   }
	   
	   
	   
	   
}
