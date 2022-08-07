
public class Stack {
	private int size;
	private int[]arr;
	private int top=0;
	public Stack(int size) throws StackException
	{
		if(size<0 || size>25)
			throw new StackException("invalid size");
		this.size=size;
		arr=new int[size];
	}
	public boolean isFull()
	{
		if(top==size-1)
			return true;
		else
			return false;
	}
	public boolean isEmpty()
	{
		if(top==0)
			return true;
		else
			return false;
	}
	public void push(int i) throws StackException
	{
		if(isFull())
		{
			throw new StackException("stack overflow");
		}
		arr[top++]=i;
	}
public int pop()throws StackException
{
	if(isEmpty())
	{
		throw new StackException("stack underflow");
	}
	return arr[--top];
	}
}
