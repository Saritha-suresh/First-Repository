package org.in;

public class Ab extends Aa {
@Override
protected Integer aa(int id) {
	System.out.println(id);
	return super.aa(id);
}
	@Override
		protected String aa(String name) {
			System.out.println(name);
			return super.aa(name);
		}

	public static void main(String[] args) {
	Ab p=new Ab();
	p.aa(123);
	p.aa("sari");
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
