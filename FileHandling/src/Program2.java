import java.io.*;
public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 try {
	 FileInputStream fin = new FileInputStream("D:\\output.txt");
	 BufferedInputStream bin = new BufferedInputStream(fin);
	 int i;
	 while((i=fin.read())!=-1)
		{
			System.out.print((char)i);
		}
	 bin.close();
	 fin.close();
 } catch(Exception e)
 {
	 System.out.println(e);
 }
	}

}
