class A{
		 int x;
}


class B extends A{
		public void f1(){
			int x=3;
			super.x=1;
			System.out.println("Super : "+super.x+"\nLocal : "+x);
		}
		public void f2(){
			
		}
}


public class Example{
	public static void main(String []args){
		B obj=new B();
		obj.f1();
		obj.f2();
	}
}