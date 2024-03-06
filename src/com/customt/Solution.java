package com.customt;

import java.util.Scanner;

public class Solution 
{
 public static void main(String[] args) 
 {
   Scanner sc = new Scanner(System.in);
   int id = sc.nextInt();
   System.out.println("input the userid");
   if(id == 12345)
   {
	   System.out.println("login successfully");
   }
   else
   {
	   try {
	   throw new InvaliduserId("invaliduserid");
	   }
	   catch(Exception e)
	   {
		   e.printStackTrace();
	   }
   }
 }
}
