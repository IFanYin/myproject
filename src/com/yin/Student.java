package com.yin;

public class Student {
int english;
int math;
int chinese;
 
  public void print(){
	  System.out.println( english +"  "+ math +"  "+chinese);
	  
  }
  public int getAverage(){
      return (english + math +chinese)/3;
      
  }
}
