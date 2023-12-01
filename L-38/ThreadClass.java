class A extends Thread{
	public void run(){
		for(int i=1;i<=10;i++){
		 System.out.println("i+"+i+"Thread A");
		}
	}
}

class B extends Thread{
	public void run(){
		for(int i=1;i<=10;i++){
		 System.out.println("i+"+i+"Thread B");
		}
	}
}

public class ThreadClass{
	public static void main(String []args){
		A A1=new A();
		B B1=new B();
		A1.start();
		B1.start();
	}
}