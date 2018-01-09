package com.yin;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList();
    list.add(94);
    list.add(87);
    list.add(55);
    list.add(4);
    int n = list.get(2);
    int n2 = list.get(3);
    
    System.out.println(list.get(1));
    System.out.println(list.size());
    for (int i=0 ; i<list.size(); i++){
    	System.out.println(list.get(i));
    	
    }
    
	}

}
