package com.customt;

public class InvaliduserId extends Exception
{
   private String message;
   public InvaliduserId(String message)
   {
	   this.message = message;
   }
   @Override
   public String getMessage()
   {
	return message;   
   }
}
