import java.io.*;
class Example{
	public static void main(String []args) throws IOException{
	FileOutputStream fout=new FileOutputStream("e:/files/coding/java/files/hello.text",true); 
		String s="Chandra Mohan  Nagar From Kota";
		char ch[]=s.toCharArray();
		for(int i=0;i<s.length();i++){
			fout.write(ch[i]);
		}
		fout.close();
	}
}