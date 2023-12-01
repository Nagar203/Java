public class Example{
	public <K> void printArray(K []s){
		for(K x:s){
			System.out.println(x);
		}
	}
	public static void main(String []args){
		Example e1=new Example();
		String s[]={"India","America","Japan"};
		Integer i[]={13,34,12,45};
		e1.printArray(s);
		e1.printArray(i);
	}
}