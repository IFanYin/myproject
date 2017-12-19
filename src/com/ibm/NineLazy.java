package com.ibm;

public class NineLazy {

	public static void main(String[] args) {
		 for (int b= 2; b <=9 ; b++ ){
			if(b<4|b>8)	{
			 for (int a = 1; a <= 9; a++) {
					if ((a * b) < 10) {
						System.out.print(a + "*" + b + "=" + (a * b)+"\t");
					} else {
						System.out.print(a + "*" + b + "=" + (a * b)+"\t");
					}
				}
	System.out.println();
	} else {
		System.out.print("..."+"\t"+"..."+"\t"+"..."+"\t"+"..."+"\t"+"..."+"\t"+"..."+"\t"+"..."+"\t");
		System.out.println();
	}
		       
		}
}}
