import java.util.*;
class Unchecked{
	public static void main(String []args){
		int x,y;
		Scanner sc1= new Scanner(System.in);
		Scanner sc2= new Scanner(System.in);
		x=sc1.nextInt();
		y=sc2.nextInt();
		try{
				System.out.println("x/y = "+x/y);
		}
		catch(ArithmeticException e){
			System.out.println("Sorry Your Error : "+e.getMessage());
		}
		System.out.println("Program End\nThank You!");
	}
	
	}