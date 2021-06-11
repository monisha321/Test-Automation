package com.sgtesting.ThreadDemo;

class Sample implements Runnable
{
	public void run()
	{
		displayEvenNumbers();
	}
	
	void displayEvenNumbers()
	{
		try
		{
			for(int i=20;i<=40;i++)
			{
				if(i%2==0)
				{
					System.out.println(Thread.currentThread().getName()+" Displays Even Number  :"+i);
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
public class ThreadRunnableRun {
	public static void main(String[] args) {
		Sample job=new Sample();
		
		Thread t1=new Thread(job);//inbuilt thread class that performs work which is passed as parameter 'job'
		t1.setName("alpha");
		t1.start();

	}

}
