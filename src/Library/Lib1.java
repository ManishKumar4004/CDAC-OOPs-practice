package Library;

public class Lib1 {
	private String dept;
	private String Owner;
	private int Libno;
	private Auther auther;
	
	public Lib1(String dep,String ow,int no,Auther auth) {
		this.dept = dep;
		this.Owner =ow;
		this.Libno = no;
		this.auther = auth;
	}
	@Override
	public String toString() {
		return "Department:"+dept+" LibOwner:"+Owner+" Lib Number:"+Libno+" Auther:"+auther;
	}

}
