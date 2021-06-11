package com.sgtesting.ThreadDemo;
class Sample2 implements Runnable
{
	public void run()
	{
		displayEvenNumbers();
	}

	synchronized void displayEvenNumbers()
	{
		try
		{
			for(int i=20;i<=40;i++)
			{
				if(i%2==0)
				{
					System.out.println(Thread.currentThread().getName()+" Displays Even Number  :"+i);
					Thread.sleep(1000);//--->without this execute nd see
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
public class MultiThreadSAFE {

	public static void main(String[] args) {

		Sample2 job=new Sample2();

		Thread t1=new Thread(job);
		Thread t2=new Thread(job);
		
		t1.setName("alpha");
		t2.setName("omega");
		
		t1.start();
		t2.start();
	}

}