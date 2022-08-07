
	public class MyThread2 {

	    public static void main(String[] args) throws InterruptedException {
	        // TODO Auto-generated method stub

	        Employee employee = new Employee();
	        employee.setBasic(1000);
	        DAThread daThread = new DAThread(employee);
	        HRAThread hraThread = new HRAThread(employee);
	        daThread.start();
	        hraThread.start();
	        daThread.join();
	        hraThread.join();
//	        here codes will executed after 2 threads are completed
	        employee.setNetSal(employee.getBasic() + employee.getDa() +
	                employee.getHra());
	        System.out.println("Net Salary : " + employee.getNetSal());
	    }
}