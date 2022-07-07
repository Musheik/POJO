package com.pojo;

public class Pojo_c {

	public static void main(String[] args) {
		 
		Pojo_A obj = new Pojo_A();
		
		
		int id = obj.getId();
		
		System.out.println("id =="+ id); // we get default value
		
		//set 
		obj.setId(7845);
		int id2 = obj.getId();
		System.out.println(id2);
	}

}
