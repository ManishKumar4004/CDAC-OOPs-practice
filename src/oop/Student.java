package oop;
import java.util.Scanner;
public class Student {
   private int Rollno;
   private String Name;
   private int Age;
   
   void setData(int Rollno,String Name,int Age) {
	   this.Rollno = Rollno;
	   this.Name = Name;
	   this.Age = Age;
   }
   void getData() {
	   System.out.println("Rollno:"+Rollno+" Name:"+Name+" Age:"+Age);
   }
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
	  Student s1 = new Student();
	  Student s2 = new Student();
	  s1.setData(28, "ABC", 32);
	  System.out.println("Name:");
	  String s = sc.nextLine();
	  System.out.println("Enter Rollno:");
	  int n = sc.nextInt();
	  System.out.println("Enter age:");
	  int a = sc.nextInt();
	  s2.setData(n, s, a);
	  s2.getData();
	  s1.getData();
    }
	   
}
