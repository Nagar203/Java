import java.io.*;
public class Example{
	public static void main(String []args) throws IOException{
		int ch;
		BufferedWriter buff=new BufferedWriter(new FileWriter("hello.text",true));
		buff.write("MBM");
		BufferedReader buffr=new BufferedReader(new FileReader("hello.text"));
		while((ch=buffr.read())!=-1){
		System.out.print((char)ch);
		}
		buffr.close();
		buff.close();
	}
}