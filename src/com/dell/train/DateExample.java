package com.dell.train;

import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		Date date1 = new Date();
		System.out.println(date.toString());
		System.out.println(date1.toString());
		// put some brain into thinking for why the below is not true
		if (date == date1) {
			System.out.println("true");
		}
		// System.out.println(date.toString());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Date date2 = new Date();
		boolean result = date.equals(date2) ? true : false;
		System.out.println(result);
	}
}
