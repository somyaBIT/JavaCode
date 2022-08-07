
public class Buyer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coffee coffee =new Coffee();
		int beverageType=1;
		VendingMachine vendingMachine = new VendingMachine(new CoffeeBuilder(null));
		 vendingMachine.prepare(1);
		 coffee.pour();
		

	}

}
