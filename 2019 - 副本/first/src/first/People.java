package first;

import java.io.Serializable;
import java.util.Scanner;

public class People implements Serializable{
	public
		String name;
		int age ;
	
		public People()
		{
			Scanner sc=new Scanner(System.in);
			System.out.print("����������");
			name=sc.nextLine();
			get();
		}
		private void get()
		{
			int  age=(int)Math.round(Math.random()*2+20);
		}
		public String toString()
		{
			return "123";
		}
}
