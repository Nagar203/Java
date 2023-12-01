class Name{
	void f(){
		System.out.println("CMN");
	}
}
class Student{
	Name n=new Name(){
		void f(){
			System.out.println("Chandra Mohan Nagar");
		} 
	};
}

public class Example{
	public static void main(String []args){
		Student s1=new Student();
		s1.n.f();
	}
}