package oop;

public class Person {
    private String Name;
    private int Age;
    private String Country;
    
    public Person() {
    	
    }
    public Person(String name) {
    	this.Name = name;
    }
    public Person(String name,int age) {
    	this.Name = name;
    	this.Age = age;
    }
    public Person(int age,String name,String country) {
    	this.Age = age;
    	this.Country = country;
    	this.Name = name;
    }
    
	public void setName(String name,int age,String country) {
		this.Name = name;
		this.Age = age;
		this.Country = country;
	}
	public void getData() {
		System.out.println("Name:"+Name+" Age:"+Age+" Country:"+Country);
	}
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("Manish", 21, "India");
		p1.getData();
		Person p2 = new Person("Manish",43);
		p2.getData();
		Person p3 = new Person(54,"Manish","India");
		p3.getData();
	}
	
    
}
