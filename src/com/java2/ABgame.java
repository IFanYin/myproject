package com.java2;

public class ABgame {

	public static void main(String[] args) {
    String secret = "4296";
    String nums = "7263";
    int a = 0;
    int b = 0;
    int length = secret.length();
    for (int i=0 ; i<nums.length() ; i++){
    	char c = nums.charAt(i);
    	for (int j=0 ; j<length ; j++) {
    		if(c==secret.charAt(j)){
    			if(i == j){
    				a++;
    			}else{
    				b++;
    			}
    		}
    	}
    }
    System.out.println(a+"A"+b+"B");
	}
	}	
    
