package Assistedprojects;
class MyEx1 extends Exception{
	   String str1;
	   MyEx1(String str2) {
		str1=str2;
	   }
	   public String toString(){ 
		return ("MyException Occurred: "+str1) ;
	   }
	}
	public class Example1{
	   public static void main(String args[]){
		try{
			System.out.println("Starting of try block");
			
			throw new MyException("This is My error Message");
		}
		catch(MyException exp){
			System.out.println("Catch Block") ;
			System.out.println(exp) ;
		}
	   }
	}
