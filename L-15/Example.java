public class Example{
	private static int y; //static member variable
	private int x; //instance member variable
	static
	{
		System.out.println("Static y = "+y);
		y=5;
		System.out.println("Static y = "+y);
	}
	{
		System.out.println("Instance x = "+x);
		x=10;
		System.out.println("Instance x = "+x);
	}
	
	public static void main(String []args){
			//Example e1=new Example();
			//Example e2=new Example();
	}
}