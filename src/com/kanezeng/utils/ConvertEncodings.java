package com.kanezeng.utils;

import java.util.regex.*;
	
public class ConvertEncodings {

	private static String hexString="0123456789ABCDEF";
	private static int maxIndex = 2;
	private static char[] firstChar = {'1','2','3'};
	private static char[] secondChar = {'2','3','4'};
	private static char[] thirdChar = {'4','5'};
	private static char[][] allChars = {firstChar,secondChar,thirdChar};
	
	public static void printPossibleString() {
		doPrintPossibleString(0,"");
	}
	private static void doPrintPossibleString(int curPos, String curResult) {
		for (char i : allChars[curPos]) {
			String tempResult = curResult + i;
			if (curPos == maxIndex) {
				System.out.println(tempResult);
			} else {
				doPrintPossibleString(curPos+1,tempResult);
			}
		}
	}
	
	public static String un2ex(String str) {
		StringBuilder sb = new StringBuilder();
		
		try {
			byte[] bytes = str.getBytes("Unicode");
			
			for (int i = 0; i<bytes.length -1 ;i +=2) {
				if(bytes[i] ==0 && bytes[i+1] <=127) {
					char[] chars = Character.toChars(bytes[i+1]);
					sb.append(new String(chars));
				} else {
					sb.append("\\u");
					sb.append(hexString.charAt((bytes[i] & 0xf0) >> 4));
					sb.append(hexString.charAt((bytes[i] & 0x0f) >> 0));
					sb.append(hexString.charAt((bytes[i+1] & 0xf0) >> 4));
					sb.append(hexString.charAt((bytes[i+1] & 0x0f) >> 0));
				}
			}
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		String myresult = sb.toString();

		if (myresult.toLowerCase().startsWith("\\ufeff")) {
			myresult = myresult.substring(6);
		}
			
		return myresult;
	}
	
	
}
