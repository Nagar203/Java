import java.util.*;
public class Example{
	public static void main(String []args){
		ArrayList l1=new ArrayList(4);
		l1.add("CM");
		l1.add("Nagar");
		Iterator I=l1.iterator();
		
		while(I.hasNext()){
			System.out.println(I.next());
			
		}
	}
	
}