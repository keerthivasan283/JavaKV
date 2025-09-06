package keerthiv;


class animal{
	void eats() {
		System.out.println("animal eats well");
	}
}
class dog extends animal{
	void barks() {
		System.out.println("dogs will barks");
	}
}
class puppy extends dog{
	void weeps() {
		System.out.println("puppy can weeps");
	}
}
public class multilevelinheritance {

	public static void main(String[] args) {
		puppy p1 = new puppy();
		p1.eats();
		p1.barks();
		p1.weeps();
		

	}

}
