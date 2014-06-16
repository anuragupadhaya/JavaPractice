package com.dell.train;

//public class ColonSplitTest {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String addressGSCV = "UP:GAZIABAD";
//		String state = string.split(":");
//		
//		for (String retval: addressGSCV.split(":",)){
//	         System.out.println(retval);
//	      }
//	}
//
//}


public class ColonSplitTest {
	 
    public static void main(String a[]){
     
        String str = "UP : GAZIABAD";
        String[] tokens = str.split(" :");
        for(String s:tokens){
            System.out.println(s);
        }
        int i = str.charAt(3); 
        System.out.println(i);
        
    }
}