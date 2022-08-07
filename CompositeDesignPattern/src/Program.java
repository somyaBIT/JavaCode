
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("a.text");
		f.ls();
		
		Directory d = new Directory("Parent Dir");

		File f1 = new File("b.text");
		d.add(f);
		d.add(f1);

		Directory d2 = new Directory("main dir");
		File f2 = new File("b.text");
		d2.add(f2);
		d.add(d2);
//		f1.ls();
		d.ls();

	}

}
