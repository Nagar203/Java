import java.io.File;
import java.io.IOException;
class FilesClass{
	public static void main(String []args) throws IOException{
	File f1=new File("e:/files/coding/java/files/google.html"); 
		System.out.println("File Size: "+f1.length());
		System.out.println("File Life: "+f1.exists());
		f1.createNewFile();
		System.out.println("File Life: "+f1.exists());
		System.out.println("File Size: "+f1.length());
		f1.delete();
	}
}