package oop;

public class BankAccount {
	    private long AccNo;
	    private String AccType;
	    private float Balance;
	    private int i = 5;
	    private static int Ir;
	    
        static {
        	 Ir=5;
        }
        public BankAccount(long accno,String acctype,int Balance ) {
        	this.AccType = acctype;
        	this.AccNo = accno;
        	this.Balance = Balance;
        }
        public void depo(int d) {
        	this.Balance = Balance+d;
        	System.out.println("Balance : "+Balance);
        	
        }
        public void withdrow(int a) {
        	float p = (Balance*Ir)/100;
        	Balance = (Balance+p);
        	System.out.println("sucessfully withdraw: "+a);
        	Balance = Balance-a;
        	System.out.println("Remaining Balance: "+Balance);
        }
        public static void main(String[] args) {
			BankAccount b1 = new BankAccount(2020283842,"Major",10000);
			BankAccount b2 = new BankAccount(345678456,"Saving",5000);
//			b1.depo(3000);
//			b2.depo(2000);
			b1.withdrow(1000);
			b2.withdrow(3000);
			
		}
        
    
    
}
