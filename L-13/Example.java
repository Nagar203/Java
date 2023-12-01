public class Example{
	private int l,b,h;
	private Example(int L,int B, int H){
		l=L;
		b=B;
		h=H;
	}
	
	public void showArea(){
	System.out.println("Box Volume : "+(l*b*h));	
	}
public static void main(String []args)
{
	Example Box=new Example(10,19,25);
	Box.showArea();
}
}