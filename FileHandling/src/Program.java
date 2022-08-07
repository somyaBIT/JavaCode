import java.io.*;
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
//			FileOutputStream fout = new FileOutputStream("d:\\output.txt");
//			fout.write(68);
////			fout.close();
////			System.out.println("success");
//			String s ="welcome to bangalore";
//			byte[] b=s.getBytes();
//			fout.write(b);
//			fout.close();
//			System.out.println("success");
			FileInputStream fin = new FileInputStream("D:\\output.txt");
			int i=0;
			while((i=fin.read())!=-1)
			{
				System.out.print((char)i);
			}
//			int i=fin.read();
//			System.out.println((char)i);
//			fin.close();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
