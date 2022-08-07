
public class Employee {


		protected String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		
	 class Manager extends Employee
	{
	    private int empid;
	    private String CompanyName;
		
		public int getEmpid() {
			return empid;
		}

		public void setEmpid(int empid) {
			this.empid = empid;
		}

		public String getCompanyName() {
			return CompanyName;
		}

		public void setCompanyName(String companyName) {
			CompanyName = companyName;
		}

		public Manager(int empid,String name, String CompanyName) {
			super();
			this.empid =empid;
			this.CompanyName = CompanyName;
			this.name=name;
		}

		
		
	}
	  class Personi {
			public static void main(String[] args) {
				
				Manager m1= new Manager(112,"Somya","Aris");
				System.out.println(m1.getEmpid()+ " "+m1.getCompanyName()+" "+m1.getName());
			}
		}
}
