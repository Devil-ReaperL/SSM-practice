package Morethread;

public class T2 extends Thread{
	public void run()
	{
		for(int i=0;i<100;++i)
		{
			if(i%5==0)
			{
				System.out.println("T2�ó�ʱ��Ƭ");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
				yield();
			}
			System.out.println("t2="+i);
		}
	}
}
