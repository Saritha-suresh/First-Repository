package org.ing;

public class Constructor  {
public Constructor()
{
	this("saritha");
	System.out.println("default");
}
	
public Constructor( String name){
	this(1233);
	System.out.println(name);
	
}
public Constructor(int num) {
	
System.out.println(num);
}
	
public static void main(String[] args) {
	Constructor c= new Constructor();
	Constructor1 d=new Constructor1();
	Constructor2 e=new Constructor2();
}
	
}	
	
	

