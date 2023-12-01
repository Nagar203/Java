class A{
	static void f1(){
		System.out.print("Class A");
	}
}
class B extends A{
	static void f1(){
		System.out.print("Class B");
	}
}
public class Example{
	public static void main(String []args){
		B obj=new B();
		obj.f1();
	}
}