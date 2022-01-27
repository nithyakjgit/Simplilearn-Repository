package Assistedprojects;
class My extends Exception 
{ 
    public My (String s) 
    { 
        super(s); 
    } 
} 
public class Mainexample
{ 
    public static void main(String args[]) 
    { 
        try
        { 
            throw new MyException("temp"); 
        } 
        catch (MyException ex) 
        { 
            System.out.println("Caught"); 
            System.out.println(ex.getMessage()); 
        } 
    } 
}
