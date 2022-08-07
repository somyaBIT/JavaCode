public class Bank {

	
	
	int balance=100000;

public void withdrawn(String name, int withdrawal)
	{
		if ( balance >= withdrawal) {
			System.out.println(name + " withdrawn "+ withdrawal);

			 balance = balance - withdrawal;
			System.out.println("Balance after withdrawal: "+ balance);
			
			try {

				Thread.sleep(1000);
			}

		
			catch (InterruptedException e) {

				
				e.printStackTrace();
			}
		}

		
		else {
			
			System.out.println(name + " you can not withdraw "+ withdrawal);

			System.out.println("your balance is: " + balance);

			try {
				Thread.sleep(1000);
			}

			catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

	
public void deposit(String name, int deposit)
	{
		System.out.println(name + " deposited " + deposit);
		 balance =  balance + deposit;
		System.out.println("Balance after deposit: "+  balance);
		
		try {
			Thread.sleep(1000);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

//class M{
//
//	// Main driver method
//	public static void main(String[] args)
//	{
//		
//		Bank obj = new Bank();
//
//	
//		obj.withdrawn("priya", 200);
//		obj.withdrawn("Monu", 4000);
//		obj.deposit("Mukti", 3500);
//		obj.withdrawn("Riya", 800);
//		obj.withdrawn("Shubham", 400);
//	}
//}

