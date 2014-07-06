package com.dell.train;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[5];
		try {
			for (int i = 0; i <= 6; i++)
				System.out.println(a[i]);
		}

		catch (Exception e) {
			System.out.println(e);
		}

		finally {
			System.out.println("finally");
		}
		
		 try {
			    long data[] = new long[100000000]; 
			  }
			  catch (Exception e) {
			    System.out.println(e);
			  }
	}

}
