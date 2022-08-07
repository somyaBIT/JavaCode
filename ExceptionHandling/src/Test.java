
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			String s ="vikas";
			int num = Integer.parseInt(s);
			System.out.println("number is : "+num);
			
		}
		catch(NumberFormatException nfe)
		{
			System.out.println("input string has to be integer");
			
		}
		System.out.println("important step");

	}

}
