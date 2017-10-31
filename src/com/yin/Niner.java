package com.yin;

public class Niner {

	public static void main(String[] args) {
		// *2 x 1 = 2.........
        for (int n= 2; n <=9 ; n++ )
		for (int i = 1; i <= 9; i++) {
			if ((n * i) < 10) {
				System.out.println(n + " x " + i + " =  " + (n * i));
			} else {
				System.out.println(n + " x " + i + " = " + (n * i));
			}
		}
	}
       
}
