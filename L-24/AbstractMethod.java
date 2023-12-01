abstract class A{
	abstract void f1();
}

class B extends A{
	void f1(){
		int x=5;
		System.out.println("This Is not Abstract Function.\n"+x);
	}
}

public class AbstractMethod{
	public static void main(String []args){
		B obj=new B();
	obj.f1();
	}
}