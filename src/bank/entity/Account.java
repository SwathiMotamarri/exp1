package bank.entity;

public class Account 
{
	public Account(int Id,String name,double balance)
	{
		this.Id=Id;
		this.name=name;
		this.balance=balance;
	}
		private int Id;
		
		public int getId()
		{
			return Id;
		}
		public void setId(int Id)
		{
			this.Id= Id;
		}
		private String name;
		
		public String getName() 
		{
			return name;
		}
		public void setName(String name)
		{
			this.name = name;
		}
		private double balance;
		public double getbalance() 
		{
			return balance;
		}
		public void setbalance(double balance) 
		{
			this.balance = balance;
		}
		
		public void AddBalance(double amount)
		{
			this.balance=this.balance+amount;
		}
		
		public void TransferAmount(Account a,double amount)
		{
				this.balance=this.balance-amount;
				a.balance=a.balance+amount;
		}
		
}

