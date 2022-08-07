
public class FactoryProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             Factory f = new WindowsFactory();
              Button b = f.createButton();
                b.draw();
                List l= f.createList();
               l.draw();
	}

}
