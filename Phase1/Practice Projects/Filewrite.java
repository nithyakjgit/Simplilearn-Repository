package Phase1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Filewrite{
	public static void main(String[] args) throws IOException {
		String data="100,kk,banglore  ";
		FileWriter output= new FileWriter("a.txt");
		output.write(data);
		System.out.println("data written succesfully");
		output.close();
		FileReader input=new FileReader("a.txt");
		input.read();
		System.out.println("data received succesfully");
		System.out.println(data);
		input.close();
		String data1="this is new append";
		FileWriter output1= new FileWriter("a.txt",true);
		output1.write(data1);
		System.out.println("appended succesfully");
		output1.close();
		
		
	}
}