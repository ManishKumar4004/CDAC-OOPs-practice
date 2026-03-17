package oop;

public class CLOb {
      private int a;
      private int b;
      public CLOb(int a,int b) {
    	  this.b = b;
    	  this.a = a;
      }
      public void sum() {
    	  System.out.println("sum:"+(a+b));
      }
      public void sub() {
    	  System.out.println("Subtraction:"+(a-b));
      }
      public void Multiple() {
    	  System.out.println("Multiplication:"+(a*b));
      }
      public void division() {
    	  System.out.println("Division:"+(a/b));
      }
      public void modulas() {
    	  System.out.println("Modulas:"+(a%b));
      }
      public static void main(String[] args) {
		CLOb c = new CLOb(5,3);
		c.sum();
		c.Multiple();
		c.division();
		c.sub();
		c.modulas();
	}
}
