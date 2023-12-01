import java.util.*;
class ThrowException{
	public static void main(String []args){
		int AccountBalance=5000;
		int WithDownBalance;
		Scanner s1= new Scanner(System.in);
		WithDownBalance=s1.nextInt();
		try{
			if(WithDownBalance>AccountBalance)
				throw new ArithmeticException("Insfficient Balance");
				AccountBalance=AccountBalance-WithDownBalance;
				System.out.println("Trangection Complete");
			}
			catch(ArithmeticException e){
				System.out.println("read It : "+e.getMessage());
			}
		System.out.println("Program Continuous....");
	}
}