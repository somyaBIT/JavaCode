
public class MyThrad extends Thread{
	public void run() {
		for(int i=0;i<5000;i++)
		{
		System.out.println("hello this is my thread "+i);
		if(i%200==0)
		{
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			
		}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		create a thread object
		MyThrad mythread=new MyThrad();
//		register the thread in the scheduling queue - t1
       mythread.start();		
       for(int i=0;i<10000;i++)
    	   System.out.println("main thread "+i);

	}

}
