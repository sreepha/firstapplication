package com.demo.firstApplication;

public class ReverseInteger {

	public void reverse(){
		int n = 214748369; 
		String num = Integer.toString(n);
		StringBuffer sb = new StringBuffer();
		StringBuffer ip = sb.append(num);
		System.out.println(ip+" "+ip.reverse());
		
	}
	
}
