public class Person {

	protected String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	}
 class student extends Person
{
    private int rollno;
    private String schoolname;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getSchoolname() {
		return schoolname;
	}
	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
	}
	public student(int rollno,String name, String schoolname) {
		super();
		this.rollno = rollno;
		this.schoolname = schoolname;
		this.name=name;
	}
	
}
  class Personi {
		public static void main(String[] args) {
			
			student s1= new student(112,"Somya","DAV");
			System.out.println(s1.getRollno()+ " "+s1.getName()+" "+s1.getSchoolname());
		}
	}