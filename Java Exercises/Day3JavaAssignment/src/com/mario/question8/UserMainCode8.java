package com.mario.question8;

public class UserMainCode8 {
	public static String getString(String str) {
		boolean firstGone = false;
		
		if (str.charAt(0) != 'k') {
			str = str.substring(1, str.length());
			firstGone=true;
		}
		
		if(firstGone==true) {
			if (str.charAt(0) != 'b') 
				str = str.substring(1, str.length());
		}
		else {
			if (str.charAt(1) != 'b') 
				str = str.charAt(0)+ str.substring(2, str.length());
		}
		
		System.out.println(str);
		return str;
	}
}