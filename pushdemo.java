package stackdemo;

import java.util.*;
 
public class pushdemo {
	   
	     public static void main(String[] args)
	    {
	 
	        // Default initialization of Stack
	       // Stack stack1 = new Stack();
	 
	        // Initialization of Stack
	        // using Generics
	        Stack<String> stack1 = new Stack<String>();
	        Stack<Integer> stack2 = new Stack<Integer>();
	 
	        // pushing the elements
	        stack1.push("All");
	        stack1.push("the");
	        stack1.push("best");
	        
	        stack2.push(1);
	        stack2.push(2);
	        stack2.push(3);	       
	 
	          // Printing the Stack Elements
	        System.out.println(stack1);
	        System.out.println(stack2);
	        
	    }
	}
