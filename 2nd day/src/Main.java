
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Singleton s1=Singleton.getInstance();
  Singleton s2=Singleton.getInstance();
  if(s1==s2)
  {
	  System.out.println("both are same obj");
  }
  
  LaserPrinter lp=new LaserPrinter();
  
  lp.print();
	}
	

}
