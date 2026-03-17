package Library;

public class Book {
	private int Bookid;
	private String BName;
	private String BColor;
	 
	public Book(int id,String name,String color) {
		this.BColor = color;
		this.BName = name;
		this.Bookid = id;
	}
	public String toString() {
		return "BookName:"+BName+" BookColor:"+BColor+" Book id:"+Bookid;
	}

}
