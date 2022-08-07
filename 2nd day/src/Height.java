import java.util.*;
import java.lang.*;
import java.io.*;


class Height{
  private  double h1,h2;
  public void feet (double h1, double h2)
    {
        this.h1=h1*2.54;
        this.h2=h2*2.54;
    }
public void inch(double h1, double h2)
    {
        this.h1=h1*30.48;
        this.h2=h2*30.48;
    }
    public double sum()
    {
        return h1+h2;
    }



	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Height obj=new Height();
		obj.feet(10,100);
 		double result=obj.sum();
 		System.out.println("the sum in centimeter is "+ result );
		obj.inch(100,1000);
       double result1=obj.sum();
       System.out.println("the sum in centimeter is "+ result1 );
		

	}
}