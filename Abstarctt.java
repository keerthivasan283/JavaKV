package keerthiv;

 abstract class Animal{

	String name;
	 
	 Animal(String name)
	 {
		 this.name = name;
	 }
	 abstract void makeSound();
 }
class Dog extends Animal{
	
	Dog(String name)
	{
		super(name);
	}
	void makeSound() {
		System.out.println("my sound");
		
	}
}
class Cat extends Animal{
	Cat(String name)
	{
		super(name);
	}
	void makeSound() {
		System.out.println("meow");
	}
}


public class Abstarctt {

	public static void main(String[] args) {
	   Dog d1 = new Dog("bobby");
	   System.out.println(d1.name);
	   d1.makeSound();
	   
	   Cat c1 = new Cat("tommy");
	   System.out.println(c1.name);
       c1.makeSound();
	}

}
