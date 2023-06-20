package stackdemo;
import java.util.*;
import java.io.*; // To retrieve or fetch the first element of the Stack or the element present at
//the top of the Stack, we can use peek() method. The element retrieved does not get deleted or removed from the Stack. 
 

public class peepdemo {	
	 
	        public static void main(String args[])
	        {
	        // Creating an empty Stack
	        Stack<String> stack = new Stack<String>();
	 
	        // Use push() to add elements into the Stack
	        stack.push("All");
	        stack.push("the");
	        stack.push("best");
	        
	 
	        // Displaying the Stack
	        System.out.println("Initial Stack: " + stack);
	 
	        // Fetching the element at the head of the Stack
	        System.out.println("The element at the top of the" + " stack is: " + stack.peek());
	 
	        // Displaying the Stack after the Operation
	        System.out.println("Final Stack: " + stack);
	    }
	}
