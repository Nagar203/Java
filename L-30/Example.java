//import java.lang.
public class Example{
	public static void main(String []args){
		String s1=new String("nagar");
		String s2="nagar";
		String s3="nagar";
		System.out.println("Compare s1 and s2 : "+(s1==s2));
		System.out.println("Compare s1 and s2 : "+(s1.equals(s2)));
		
		System.out.println("Compare s1 and s2 : "+(s3==s2));
		System.out.println("Compare s1 and s2 : "+(s3.equals(s2)));
		
	}
}