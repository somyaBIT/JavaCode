
public class ExamMarks {
	
double phys,chem,maths,result;

public ExamMarks(double phys, double chem, double maths) {
	super();
	this.phys = phys;
	this.chem = chem;
	this.maths = maths;
}

public double getPhys() {
	return phys;
}

public void setPhys(double phys) {
	this.phys = phys;
}

public double getChem() {
	return chem;
}

public void setChem(double chem) {
	this.chem = chem;
}

public double getMaths() {
	return maths;
}

public void setMaths(double maths) {
	this.maths = maths;
}
public String getResults(double a,double b,double c)
{
	result=(a+b+c)/3;
	if(result>=75)
	{
		return "1st grade pass";
	}
	else if(result>=40 && result<=75 )
		
	{
		return "2nd division";
	}
	else
	{
		return "failed";	
	}
	
}




		
}
