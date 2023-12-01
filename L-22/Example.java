class A{
	public A(){
		System.out.println("A");
	}
}
class B extends A{
	
	public B(){
		this(3);
		System.out.println("B 1");
	}
	public B(int i){
		
		System.out.println("B 2");
	}
}
public class Example{
		public static void main(String []args){
			B obj=new B();
		}
}