import java.io.*;
public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileOutputStream input1 = new FileOutputStream("D:\\f1.txt");
		FileOutputStream  input2 = new FileOutputStream ("D:\\f2.txt");		
		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		bout.write(65);
		bout.writeTo(input1);
		bout.writeTo(input2);
		bout.flush();
		bout.close();
		System.out.println("Success");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
