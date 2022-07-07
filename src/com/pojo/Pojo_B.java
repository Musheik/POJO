package com.pojo;

public class Pojo_B {

	public static void main(String[] args) {
		
		
		Pojo_A obj = new Pojo_A();
		
		int id = obj.getId();
		System.out.println("id ==" +id);
		
		// we only call set method whenever we need to chaneg the input value in some other classes
		
		// set
		
		obj.setId(7887); // its not change
		
		
		int id2 = obj.getId();
		
		
		System.out.println("id2 =="+id2);
		
		
		
		// set another value
		
		obj.setId(546);
		
		int id3 = obj.getId();
		
		System.out.println("id 3 =="+id3);
		
		
		//set another
		
		obj.setId(54628);
		
		int id4 = obj.getId();
		
		System.out.println("id4==" + id4);
	}

}
