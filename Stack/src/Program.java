
class Program{
//	complime time exception usig throw 
//	run time exception handle by try nd catch
	public static void main(String[]args) throws StackException
	{
		Stack s=new Stack(3);
		s.push(10);
		s.push(1000);
		s.push(100);
		s.push(101);
		s.push(109);
		System.out.println(s.pop());
	}
}
