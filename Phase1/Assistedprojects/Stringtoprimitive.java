package Assistedprojects;

public class Stringtoprimitive {

	public static void main(String[] args) {
		String strObject = "124";
		 
		try{
		    
		    int i = Integer.parseInt(strObject);
		    System.out.println("String to int: " + i);
		    
		}catch(NumberFormatException nfe){
		    System.out.println("Invalid number");
		}

		String strObject1 = "3212343";
		 
		try{
		    
		    long l = Long.parseLong(strObject1);
		    System.out.println("String to long: " + l);
		    
		}catch(NumberFormatException nfe){
		    System.out.println("Invalid number");
		}
		String strObject2 = "2342.432";
		 
		try{
		    
		    float f = Float.parseFloat(strObject2);
		    System.out.println("String to float: " + f);
		    
		}catch(NumberFormatException nfe){
		    System.out.println("Invalid number");
		}
		String strObject3 = "134232.324221";
		 
		try{
		    
		    double d = Double.parseDouble(strObject3);
		    System.out.println("String to double: " + d);
		    
		}catch(NumberFormatException nfe){
		    System.out.println("Invalid number");
		}
		String strObject4 = "true";
		 
		boolean b = Boolean.parseBoolean(strObject4);
		System.out.println("String to boolean: " + b);
		
		String strObject5 = "a";
		char c = strObject5.charAt(0);
		
	}

}
