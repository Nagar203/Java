class A{
	int x;
	public A(int i){
		x=i;
		System.out.println("A");
	}
}
class B extends A{
	int y;
	public B(){
		super(1);
		System.out.println("B"+x);		
	}
}
public class Example{
	public static void main(String []args){
		B obj=new B();
	}
}