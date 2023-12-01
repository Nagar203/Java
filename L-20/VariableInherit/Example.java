class A{
	static int x=3;
}
class B extends A{
	 static{
		x=23;
	 } 
	
	
	
}

public class Example{
	public static void main(String []args){
		B obj=new B();
		
		System.out.print("x = "+obj.x);
	}
}