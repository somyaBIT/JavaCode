
public class CoffeeBuilder implements Builder {

	private Coffee coffee;
	public CoffeeBuilder(Coffee coffee) {
		super();
		this.coffee = coffee;
	}

	@Override
	public void addWater(Water water) {
		// TODO Auto-generated method stub
		System.out.println("adding water");
		

	}

	@Override
	public void addMilk(Milk milk) {
		// TODO Auto-generated method stub
		System.out.println("adding milk");

	}

	@Override
	public void addSugar(Sugar sugar) {
		// TODO Auto-generated method stub
		System.out.println("adding sugar");

	}

	@Override
	public void addCoffeePowder(CoffeePowder coffeePowder) {
		// TODO Auto-generated method stub
		System.out.println("adding coffeepowder");

	}

	@Override
	public void addTeaPowder(TeaPowder teaPowder) {
		// TODO Auto-generated method stub
//            no implementation
	}

}
