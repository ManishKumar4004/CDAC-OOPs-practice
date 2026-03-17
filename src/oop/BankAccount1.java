package oop;

public class BankAccount1 {
	private long AccNo;
    private String AccType;
    private float Balance;
    private static int Ir;
    
    static {
    	 Ir=5;
    	 
    }
    public BankAccount1(long accno,String acctype,int Balance ) {
    	this.AccType = acctype;
    	this.AccNo = accno;
    	this.Balance = Balance;
    }
    public void Accdetails() {
    	float t = (Balance*Ir)/100;
    	float TBalance = Balance+t;
    	System.out.println("AccNo:"+AccNo+"\n AccType:"+AccType+"\n Total Balance:"+TBalance+"\n Interest Earned:"+t);
    }
    public void TBalance(){
        float t = Balance+(Balance*Ir/100);
        System.out.println("Total Balance:"+t);
    }
    
    
    
    public static void main(String[] args) {
		BankAccount1 b1 = new BankAccount1(2020283842,"Major",10000);
		BankAccount1 b2 = new BankAccount1(345678456,"Saving",5000);
//		b1.Accdetails();
//		b2.Accdetails();
		b1.TBalance();
		b2.TBalance();
		
		
	}
}
