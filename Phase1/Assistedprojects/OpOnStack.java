package Assistedprojects;
import java.util.Stack;

public class OpOnStack {
	 public static void main(String[] args) 
	 { 
	     Stack stack1 = new Stack(); 

	     Stack<String> stack2 = new Stack<String>(); 

	     stack1.push(4); 
	     stack1.push("Geeks"); 
	     stack1.push("All"); 
	     
	     System.out.println("index of elemtn All inside the stack"+ stack1.indexOf("All"));
	     
	     System.out.println("The element at the top of the"+ " stack-1 is: " + stack1.peek()); 

	     stack2.push("Geeks"); 
	     stack2.push("For"); 
	     stack2.push("Goa"); 
	     
	     System.out.println("The element at the top of the"+ " stack-2 is: " + stack2.peek()); 

	     System.out.println(stack1); 
	     System.out.println(stack2); 
	     
	     System.out.println("Popped element from stack 1: " + stack1.pop()); 
	     System.out.println("Popped element from stack 2: " + stack2.pop());      
	 } 

}
