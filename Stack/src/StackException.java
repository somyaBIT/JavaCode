
public class StackException extends Exception {
	private String msg;
	public StackException(String msg)
	{
		this.msg=msg;
	}
	public void showError()
	{
		System.out.println(msg);
	}

}
