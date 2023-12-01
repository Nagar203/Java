class A{
	public void f1(int x){
		System.out.println("Class A");
	}
}
class B extends A{
	public void f1(int x,int y){
		System.out.println("Class B");
	}
}
public class Example{
	public static void main(String []args){
		B o=new B();
		o.f1(25);
		o.f1(23,13);
	}
}