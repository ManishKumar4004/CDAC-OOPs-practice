package oop;

public class Const {
     private float length;
     private float breath;
     
     public Const(float l,float b) {
    	 this.breath = b;
    	 this.length = l;
     }
     
     public float getArea() {
    	 return length*breath;
     }
     public float getperimeter() {
    	 return 2*(length+breath);
     }
     
     public static void main(String[] args) {
		Const c = new Const(20,10);
		float a = c.getArea();
		float d = c.getperimeter();
		System.out.println("Area: "+a+"\nPerimeter:"+d);
		
	}
}
