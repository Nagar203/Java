//mean here final word use for final the member or task in other word no change after add final in function,class or variable

class A{
		final public void f2(){
			
		}
}

class B extends A{
		public void f2(){ //not override
			
		}
	
}

public class Example{
	private final int x; //insrtance member variable initilize this variable three type
	private final static int y;//static member variable initilize this variable three type
	public Example(){
		x=2;//initilize by constructor
	}
	static{
		y=4//static initilizer
	}
	
	public void f1(){
			final int z=24; //local variable and its value does not change
	}
	
	public static void main(String []args){
		
	}
}