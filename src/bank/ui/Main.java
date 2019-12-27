package bank.ui;

import bank.entity.Account;

public class Main 
{
	public static void main(String[] args)
	{
			Account store[]=new Account[2];
			store[0]=new Account(1, "Ram", 2000);
			store[1]=new Account(2, "Sita", 2000);
			Main m=new Main();
			m.println(store);
			System.out.println("Added new balance");
			store[0].AddBalance(500);
			m.println(store);
			System.out.println("After transaction");
			store[0].TransferAmount(store[1],200);
			m.println(store);			
			}
	public void println(Account acc[])
	{
		for(int i=0;i<2;i++)
		{
			System.out.println("ID="+acc[i].getId());
			System.out.println("NAME= "+acc[i].getName());
			System.out.println("BALANCE= "+acc[i].getbalance());
		}
	}
}
