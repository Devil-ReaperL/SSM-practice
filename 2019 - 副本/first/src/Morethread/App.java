package Morethread;

public class App extends Thread{
	private   int apple=5;
	
	public synchronized boolean getapp()
	{
		if(apple==0)
		return false;
		else 
		{
			apple--;
			System.out.println(Thread.currentThread().getName()+"小朋友得到了一个苹果"+"\t 剩余"+apple);
			notify();
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return true;
		}
	}
	
	public void run()
	
	{
		while(getapp())
		{
		
		}
			System.out.println(Thread.currentThread().getName()+"没有得到");
			try {
				join();
			} catch (InterruptedException e) {
				
			}
	}
}
