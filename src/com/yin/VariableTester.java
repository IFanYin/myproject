package com.yin;

import java.util.Random;

public class VariableTester {

	public static void main(String[] args) {
        int age = 18;
        System.out.println(age);
        
        float weight = 69.5f;
        System.out.println(weight);
        
        char c = 65;
        System.out.println(c);
        
        char c2 = 'Z';
        System.out.println(c2);
        
        int i = c2;
        System.out.println(i);
        System.out.println((int)c2);
       
        boolean pass = false;
        System.out.println(!pass);
        System.out.println(pass);
	   String s = new String("Hello");
	   Random r = new Random();
           int n1 = r.nextInt(6)+1;
           System.out.println(3 >= 2);
	}

}
