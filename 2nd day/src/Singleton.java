
public class Singleton {
	private int num;
	private static int objcount;
	private static Singleton singleton ;
	private Singleton()
	{
		objcount++;
	}
	public static Singleton getInstance()
	{
		if(objcount==0)
		{
			singleton= new Singleton();
		}
		return singleton;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	

}
