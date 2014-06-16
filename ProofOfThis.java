package com.dell.train;

public class ProofOfThis {
	
	void msg(){
		System.out.println(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProofOfThis obj = new ProofOfThis();
		System.out.println(obj);
		obj.msg();
	}

}
