package Morethread;

public class Main {

	public static void main(String[] args) {
//		Thread t1=new T1();
//		Thread t2=new T2();
//		Thread r1=new Thread(new R1());
//		t1.start();
//		t2.start();
//		r1.start();
		Thread a=new App();
		Thread b=new Thread(a);
		a.setName("С��");
		b.setName("С��");
		a.start();
		b.start();

	}

}
