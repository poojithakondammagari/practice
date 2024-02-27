package com.java4;
	import java.util.ArrayList;  
	import java.util.List;  
	public class ForEach {  
	    public static void main(String[] args) {  
	        List<String> countriesList = new ArrayList<String>();  
	       countriesList.add("Japan");  
	       countriesList.add("France");  
	       countriesList.add("USA");  
	       countriesList.add("India");  
	       System.out.println("Iterating by passing lambda expression");  
	        countriesList.forEach(countries -> System.out.println(countries));  
	          
	    }  
	}  
