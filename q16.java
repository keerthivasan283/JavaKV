import java.util.Scanner;

class q16{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String colour = scan.nextLine();

    if (colour.equals("red"))
    {
        System.out.println("stop");
    }
    else if ( colour.equals("yellow"))
    {
        System.out.println("wait");
    }
    else if ( colour.equals("Green"))
    {
        System.out.println("go");

    }

    }

 }


