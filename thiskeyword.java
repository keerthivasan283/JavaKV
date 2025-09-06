package keerthiv;

public class thiskeyword {
	
	String myname;
	
	thiskeyword()
	{
		System.out.println("keerthi");
	}
	void setname(String myname)
	{
		this.myname = myname;
	}

	public static void main(String[] args) {
		thiskeyword t12 = new thiskeyword();
		t12.setname("vaishu");
		System.out.println(t12.myname);

	}

}
