package com.yin;

import java.util.Scanner;

public class Switch {
   public static void main(String[] args) {
		System.out.println("number:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int n = Integer.parseInt(line);
		switch(n){
    	case 1:
    		System.out.println("星期1");
    		break;
    	case 2:
    		System.out.println("星期2");
    		break;
	    case 3:
		    System.out.println("星期3");
		    break;
        case 4:
	        System.out.println("星期4");
	        break;
        case 5:
	        System.out.println("星期5");
	        break;
	    case 6:
		    System.out.println("星期");
		    break;
        case 7:
	        System.out.println("星期");
	        break;
		}}}