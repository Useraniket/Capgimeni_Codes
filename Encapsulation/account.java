package Encapsulation;

public class account {

	private String holder="Aniket";
    private double balance=80000;
    private long acc_number=12345678l;
    public String getholder()
    {
    	return this.holder;
    }
    public double getbalance()
    {
    	return this.balance;
    }
    public long getacc_number()
    {
    	return this.acc_number;
    }
   public void setname(String n)
   {
	   this.holder=n;
   }
   public void setbalance(double b)
   {
	   this.balance=b;
   }
   public void setacc_number(long a)
   {
	   this.acc_number=a;
   }
   public static double deposit(double amount)
   {
	   account acc=new account();
	   return acc.balance+amount;
   }
   public static double withdraw(double amount)
   {
	   account acc=new account();
	   return acc.balance-amount;
   }
   
}
