package keerthiv;

class Counter {
	static int count=0;
	int instanceNumber =0;
	
	Counter()
	{
		count=count+1;
		instanceNumber = instanceNumber+1;
	}
	void disp() {
		System.out.println("instance no"+instanceNumber);
		System.out.println("static count"+count);
	}
}
public class Static {
	public static void main(String[]args) {
		Counter c1 = new Counter();
		c1.disp();
		Counter c2 = new Counter();
		c2.disp();
		Counter c3 = new Counter();
		c3.disp();
	}
   
}
