package com.hubberspot.junit5.example;

public class StringHelper {
	
	public String reverse(String input) {
		if(input == null) {
			return null;
		}
		
		if("".equals(input)) {
			return "";
		}
		
		char[] chars = input.toCharArray();
		int start = 0;
		int end = chars.length - 1;
		
		while(start < end) {
			char temp = chars[start];
			chars[start] = chars[end];
			chars[end] = temp;
			start++;
			end--;
		}
		
		return new String(chars);
	}
	
}
