import java.io.*;
public class Example{
	public static void main(String []args) throws IOException{
		int i;
		FileInputStream f= new FileInputStream("./hello.text");
		do{
			i=f.read();
			if(i!=-1){
				System.out.print((char)i);
			}
		}while(i!=-1);
	f.close();
	}
}