package keerthiv;

 class Animal {
	String name  ;
	int age ;
	
	 void makesSound(){
		 System.out.println("Animal makes a sound");
		
	}
 }
	 
	class Dog extends Animal{
		String breed;
		
		void makesSound() {
			System.out.println("Dogs Bark");
		}
		void fetch() {
			System.out.println("Dog is fetching");
		}
	}
	
	class cat extends Animal{
		String color;
		
		void makesSound() {
			System.out.println("cat meows");
		}
		
		void climb() {
			System.out.println("cat is climbing");
		}
		
	}
	
public class Mainclass{
	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.name = "timmy";
		d1.age = 2;
		d1.breed = "rajapalayam";
		d1.makesSound();
		d1.fetch();
		
		cat c1 = new cat();
		c1.name = "vaishu";
		c1.age = 3;
		c1.color = "white";
		c1.makesSound();
		c1.climb();
		
		
	}

	}
