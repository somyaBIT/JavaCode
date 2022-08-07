
public class TestClone{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s= new Student();
		s.initalize(1,"Somya");
//		s2 act like reference variable
		Student s2=  (Student)s.clone();
		System.out.println("roll "+ s2.rollNo);
	}

}
