package com.example.crmsdemo.exception;

public class InvalidUsernameException extends Exception {

	private static final long serialVersionUID = 1L;
	int userNameConditionViolated = 0;
  
    public InvalidUsernameException(int conditionViolated)
    {
        super("Invalid Usename: ");
        userNameConditionViolated = conditionViolated;
    }
  
    public String printMessage()
    {
        // Call constructor of parent Exception
        // according to the condition violated
        switch (userNameConditionViolated) {
  
        // Password should contain at least
        // one upper case letter(A-Z)
        case 1:
            return ("Password should contain at"
                    + " least one uppercase letter(A-Z)");
  
        // Password should contain at least
        // one lower case letter(a-z)
        case 2:
            return ("Password should contain at"
                    + " least one lowercase letter(a-z)");
        }
  
        return ("");
    }
}
  
// Driver Class
