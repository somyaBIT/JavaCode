
public class Student extends Person{
	private int rollNo;

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public Student(int rollNo,String name) {
		super(name);
		this.rollNo = rollNo;
	}
@Override	
public void showDetails()
{
   System.out.println("Roll No."+ this.getRollNo());
   System.out.println("Name "+ this.getName());
   
}
}
