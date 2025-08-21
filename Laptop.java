public class Laptop{

    String name ="";
    String processor="";
    int price = 0;
    int ram = 0;

    public static void main(String[] args) {

        Laptop lap1 = new Laptop();

         lap1.name = "hp";
         lap1.processor="i9";
         lap1.price=20000;
         lap1.ram=12;

         Laptop lap2 = new Laptop();

         System.out.println(lap2.price);
         System.out.println(lap1.name);

        
    }

}