package com.demo.firstApplication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//import ch.qos.logback.core.net.SyslogOutputStream;


public class AddNumbers {

	
	public static void main(String[] args)
	{
	
	Integer[] array = {2,7,11,15,0,9};
	Map<Integer,Integer> num = new HashMap<Integer,Integer>();   
	

	
	for(int i=0;i<=array.length-1;i++){
		for(int j=1;j<=array.length-1;j++){

			if(array[i]+array[j]==9){
				num.put(array[i],array[j]);	
				num.forEach((key,value) -> System.out.println(key + "  " + value));

			}
			
		}

	}
	 
	ReverseInteger ri = new ReverseInteger();
	ri.reverse();

	}
	
}	
    
    

