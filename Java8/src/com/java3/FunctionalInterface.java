package com.java3;
 
	interface sayable{  
	    void say(String msg);  
	}  
	public class FunctionalInterface implements sayable{  
	    public void say(String msg){  
	        System.out.println(msg);  
	    }  
	    public static void main(String[] args) {  
	        FunctionalInterface f1 = new FunctionalInterface();  
	        f1.say("Hello there");  
	    }  
	}  

