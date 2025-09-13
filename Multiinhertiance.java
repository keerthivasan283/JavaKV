package keerthiv;

interface Readable{
	void read();
}

interface Writeable{
	void write();
	
}

interface Storeable{
	void store();
}

class D implements Readable,Writeable,Storeable
{
	public void read()
	{
		System.out.println("reading");
	}
	public void write()
	{
		System.out.println("writing");
	}
	public void store()
	{
		System.out.println("storing");
	}
	
}
public class Multiinhertiance {

	public static void main(String[] args) {
		D d1 = new D();
		d1.read();
		d1.write();
		d1.store();
		

	}

}
