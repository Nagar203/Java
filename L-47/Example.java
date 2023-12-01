import java.io.*;
public class Example{
	public static void main(String []args) throws IOException{
		int ch;
	BufferedReader buff=new BufferedReader(new FileReader("../l-45/hello.text")); 
		
		while((ch=buff.read())!=-1){
			System.out.print((char)ch);
		}
		buff.close();
	}
}