package Library;

public class Main {
  public static void main(String[] args) {
	Book b1 = new Book(2026,"LetUsC","Green");
	Book b2 = new Book(2025,"Pyhton","Red");
	
	Auther a1 = new Auther("Retchi",123,67,b1);
	Auther a2 = new Auther("Lucent",321,70,b2);
	
	Lib1 l1 = new Lib1("B.tech","Mukesh",3,a1);
	Lib1 l2 = new Lib1("MBA","Rahul",4,a2);
	
    System.out.println(l1);
    System.out.println(l2);
	
}
}
