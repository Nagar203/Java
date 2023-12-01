package pack2;
import pack1.Student;
public class Example{
	public static void main(String []args){
	Student ram=new Student();
	ram.setName("ram");
	ram.setId(24);
	System.out.println("Student Name : "+ram.showName());
	System.out.println("Student Id : "+ram.showId());
	}
}