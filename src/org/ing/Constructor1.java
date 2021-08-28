package org.ing;

public class Constructor1 extends Constructor2 {
	public Constructor1()
	{
		this("Lucky");
		System.out.println("default1");
	}
		
	public Constructor1( String name){
		this('l');
		System.out.println(name);
		
	}
	public Constructor1(char letter) {
		
	System.out.println(letter);
	}

}
