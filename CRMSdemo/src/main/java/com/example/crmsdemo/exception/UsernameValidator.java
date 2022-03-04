package com.example.crmsdemo.exception;

public class UsernameValidator {

		  
	    // A utility function to check
	    // whether a password is valid or not
	    public static void isValid(String userName)
	        throws InvalidUsernameException
	    {
	    	if (true) {
	            int count = 0;
	  
	            // checking capital letters
	            for (int i = 65; i <= 90; i++) {
	  
	                // type casting
	                char c = (char)i;
	  
	                String str1 = Character.toString(c);
	                if (userName.contains(str1)) {
	                    count = 1;
	                }
	            }
	            if (count == 0) {
	                throw new InvalidUsernameException(1);
	            }
	        }
	  
	        if (true) {
	            int count = 0;
	  
	            // checking small letters
	            for (int i = 90; i <= 122; i++) {
	  
	                // type casting
	                char c = (char)i;
	                String str1 = Character.toString(c);
	  
	                if (userName.contains(str1)) {
	                    count = 1;
	                }
	            }
	            if (count == 0) {
	                throw new InvalidUsernameException(2);
	            }
	        }
	  
	        // The password is valid
	    }
	  
	    // Driver code
	    public static void main(String[] args)
	    {
	  
	        String username1 = "GeeksForGeeks";
	  
	        try {
	            System.out.println("Is UserName "
	                               + username1 + " valid?");
	            isValid(username1);
	            System.out.println("Valid UserName");
	        }
	        catch (InvalidUsernameException e) {
	            System.out.print(e.getMessage());
	            System.out.println(e.printMessage());
	        }
	  
	        String username2 = "Geek007@GFG";
	        try {
	            System.out.println("\nIs UserName "
	                               + username2 + " valid?");
	            isValid(username2);
	            System.out.println("Valid UserName");
	        }
	        catch (InvalidUsernameException e) {
	            System.out.print(e.getMessage());
	            System.out.println(e.printMessage());
	        }
	    }
		
	

}
