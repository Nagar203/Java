public class I{
 private static int x;
	static
	{
 	 System.out.println("Initialization Block:x="+x);
	 x=5;
	}

 public I()
	{
	 System.out.println("Constructor Block:x="+x);
	}
 public static void main(String []args)
	{
	 I i1=new I();
	 I i2=new I(); 
	}
}