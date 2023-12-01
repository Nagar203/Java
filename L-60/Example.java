class Gen<T>{
	T i;
	public void set(T i1){
		i=i1;
	}
	public T get(){
		return i;
	}
}
public class Example{
	public static void main(String[] args){
		Gen<String> m1=new Gen<String>();
		Gen<Integer> m2=new Gen<Integer>();
		m1.set("CM");
		m2.set(13);
		System.out.println("m1 = "+m1.get()+"\nm2 = "+m2.get());
	}
}