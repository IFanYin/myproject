package com.yin;

public class Foo {

	public static void main(String[] args) {
    Student stu = new Student();
    stu.english = 55;
    stu.math = 77;
    stu.chinese =76;
    stu.print();
    int avg = stu.getAverage();
    System.out.println("王曉明"+ avg);
    
    
	}

}
