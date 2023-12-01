class B{
	private int l,b,h;
	public void setDimension(int l,int b,int h){
		this.l=l;
		this.b=b;
		this.h=h;
	}
	
	public void getArea(){
		System.out.println("Box Area : "+l*b*h);
	}
}
public class Example{
	public static void main(String []args){
		B obj=new B();
		obj.setDimension(13,14,12);
		obj.getArea();
	}
}