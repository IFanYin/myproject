package com.yin;


public class GameTester {

	public static void main(String[] args) {
    int score = 100;
    		System.out.println(score/10);
    int level = score/10;
    
    
     switch (level){
     case 1 :
     case 2 :
     case 3 :
     case 4 :
     case 5 :
    	System.out.println("Failed");
    	 break;
     case 6:
    	System.out.println("pass");
    	break;
     case 7:	 
        System.out.println("good");
        break;
     case 8:
    	 System.out.println("great");
    	 break;
     case 9: 
     case 10:
         System.out.println("excellent"); }
	}

}
