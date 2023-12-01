import java.util.*;
public class Example{
	public static void main(String []args){
		System.out.print("Enter the 1st Array : ");
		Scanner t=new Scanner(System.in);
		int i=t.nextInt();
		int a[][]=new int[i][];
		
		for(int j=0;j<a.length;j++){
			System.out.print("Enter a["+j+"] length = ");
			int k=t.nextInt();
			a[j]=new int[k];
		}
		for(int j=0;j<a.length;j++){
		System.out.println("Value a["+j+"] length = "+a[j].length);
		}		
	}
}