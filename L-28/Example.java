import java.util.*;
public class Example{
	public static void main(String []args){
		System.out.print("Numbers of Tables Which You Find ");
		Scanner t=new Scanner(System.in);
		int n=t.nextInt();
		int arr[]=new int[n];
		for(int j=0;j<n;j++){
			System.out.print("Enter "+(j+1)+" Table : ");
				arr[j]=t.nextInt();
		}
		
		for(int j=0;j<arr.length;j++){
			int k=arr[j];
		for(int i=1;i<=10;i++){
			System.out.println(i+" x "+k+"= "+(i*k));
		}
		System.out.println("______________________");
		}
		
	}
}