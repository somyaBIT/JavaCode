import java.util.ArrayList;
import java.util.Iterator;

public class Program {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("Rama");
		list.add("Somya");
		list.add("Sourabh");
		
		Iterator<String> iter= list.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}

	}

}
