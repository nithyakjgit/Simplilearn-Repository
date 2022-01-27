package Assistedprojects;
class EmpInfo{
	int id;
	String name;

void display(int id,String name) {
	System.out.println(id+" "+name);
	}
}

public class constructorDemo {

public static void main(String[] args) {

	EmpInfo emp1=new EmpInfo();
	EmpInfo emp2=new EmpInfo();

	emp1.display(1,"akul");
	emp2.display(2,"amar");
	}
}
