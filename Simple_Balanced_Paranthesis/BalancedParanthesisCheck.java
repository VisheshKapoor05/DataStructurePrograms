package DataStructurePrograms.Simple_Balanced_Paranthesis;

import java.util.Stack;

public class BalancedParanthesisCheck {
	
	Stack<Character> stack = new Stack<Character>();        //initializing stack of characters
	boolean	paranthesisCheck;                               // paranthesisCheck checks the paranthesis is balanced or not
	
	
	// checking that the parantheses are balanced or not:
	public boolean paranthesisCheck(String string) {
		
		for(int i=0; i<string.length(); i++) {
			char element = string.charAt(i);                // storing each character of the string in element
			paranthesisCheck = stackService(element);
			
			// if the stackService returns false, it breaks the loop
			if(paranthesisCheck == false) {
				break;
			}			
		}
		
		// if the stack is not empty, that means it still contains an open paranthesis, hence not balanced
		if(stack.isEmpty() == false)
			paranthesisCheck = false;
		
		return paranthesisCheck;
	}
	
	
	// checking and doing operations on the stack:
	public boolean stackService(char element) {
		boolean checkElement = false;                       // inititalizing checkElement to return true or false
		if(element == '(') 
		{
			stack.push(element);                            // push to the stack if an open paranthesis is encountered
			checkElement = true;
		}
		else if(element == ')')                             // if closing paranthesis is encountered and... 
		{
			if(stack.size() == 0)
			{
				checkElement = false;                       // but the stack is empty, then there's no open paranthesis and hence its not balanced
			}
			else if(stack.peek() == '(') {
				stack.pop();                                // if the last element of the stack is open paran., then pop as the pair is satisfied
				checkElement = true;
			}
			else {
				checkElement = false;
			}
		}
		else {
			checkElement = true;                            // return true if any character is encountered other than ()
		}
		return checkElement;
	}
}
