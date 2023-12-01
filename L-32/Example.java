import java.util.*;
public class Example{
	public static void main(String []args){
		String st=null;
		try{
			System.out.println("x/y = "+st.length());
		}
		catch(NullPointerException e){
			System.out.println("Exception = "+e.getMessage());
		}
	}
}