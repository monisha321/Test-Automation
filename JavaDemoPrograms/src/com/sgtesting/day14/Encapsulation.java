package com.sgtesting.day14;
class Bank
{
	String bankname;
	private int ANO;//cant be accessed outside this class
	
	public void setAccno(int accountno)//setter--->to access private info of class for specific purposes
	{
		this.ANO=accountno;
	}
	
	public int getAccno()//getter
	{
		return ANO;
	}
}
public class Encapsulation {
	public static void main(String[] args) {
		Bank hdfc=new Bank();
		hdfc.bankname="hdfc bank";
		System.out.println("bank name is "+hdfc.bankname);
		
		//hdfc.accountno=234;---->cant be accessed outside the class
		
		hdfc.setAccno(1000234);//to access private class info.
		int Accno=hdfc.getAccno();
		System.out.println("account number is "+Accno);
	}

}
