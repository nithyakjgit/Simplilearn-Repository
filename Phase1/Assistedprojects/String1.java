package Assistedprojects;
public class String1{
	public static void main(String[] args) {
String str = "Hello"; 

StringBuffer sbr = new StringBuffer(str); 
sbr.reverse(); 
System.out.println("String to StringBuffer");
System.out.println(sbr); 
 
StringBuilder sbl = new StringBuilder(str); 
sbl.append("world"); 
System.out.println("String to StringBuilder");
System.out.println(sbl);              		
}
}



