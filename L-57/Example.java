class Outer{
	static int x;
	static class Inner{
		void f(){
			System.out.println("Function Run");
		}
	}
}

public class Example{
	public static void main(String []args){
		//Outer out=new Outer();
		Outer.Inner o1=new Outer.Inner();
		o1.f();
	}
}