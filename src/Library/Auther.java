package Library;

public class Auther {
    private String Name;
    private int id;
    private int Age;
    private Book book;
    
    public Auther(String name,int id,int age,Book bok) {
    	this.Name = name;
    	this.id = id;
    	this.Age = age;
    	this.book = bok;
    }
    @Override
    public String toString() {
    	return "Name:"+Name+"id:"+id+"Age:"+Age+"Book"+book;
    }
}
