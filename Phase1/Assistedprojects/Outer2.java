package Assistedprojects;

public class Outer2{
	static int data = 60;
	
		static class Inner{
		 void display() {
				System.out.println(data);
			}
		}
		public static void main(String[] args) {
			//Staticnested s=new Staticnested();
	Outer2.Inner i=new Outer2.Inner();
			i.display();
		}

	}

