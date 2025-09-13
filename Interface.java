package keerthiv;


interface playable{
	void play();
}

class guitar implements playable{
	
	public void play()
	{
		System.out.println("play guitar");
	}
}
class piano implements playable{
	
	 public void play() {
		System.out.println("play piano");
	}
	
}
public class Interface {
	public static void main(String[] args) {
		piano p1 = new piano();
		p1.play();
		
	} 
	
	

}
