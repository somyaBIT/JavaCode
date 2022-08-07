
public class Student implements Cloneable{
	int rollNo;
	String name;
public void initalize(int rollNo,String name)
{
  this.rollNo=rollNo;
  this.name=name;
}

public Object clone()
{
   try {
	   return super.clone();
   }catch(CloneNotSupportedException e)
   {
	 e.printStackTrace();   
   }
return null;
}
}
