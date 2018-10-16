package com.calc;

public class Addition {

	int a,b;
public Addition() {
	// TODO Auto-generated constructor stub
}
Addition(int q, int r){
	a=q;
	b=r;
}
	

	public int getAddition() {
		return this.a+this.b;
	}
	
	public static void main(String[] args) {
		Addition add = new Addition(2,3);
		System.out.println("Addition:::::"+add.getAddition());
				
	}
}
