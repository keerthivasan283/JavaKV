package keerthiv;

public class constructor {
	
	int marks;
	String name;
	
	constructor(int a,String b)
	{
		marks = a;
		name = b;
	}

	public static void main(String[] args) {
		constructor ob1 = new constructor(23,"vaishu");
		System.out.println(ob1.marks);
		System.out.println(ob1.name);

	}

}
