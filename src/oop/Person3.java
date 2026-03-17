package oop;

public class Person3 {
     private String Name;
     private int Age;
	 public Person3(String name,int age) {
		 this.Name = Name;
		 this.Age = age;
	 }
	 public void getAge() {
		 System.out.println(Age);
	 }
     public static void main(String[] args) {
		Person3 p1 = new Person3("Rahul",24);
		Person3 p2 = new Person3("Alice",25);
		p1.getAge();
		p2.getAge();
	}
}
