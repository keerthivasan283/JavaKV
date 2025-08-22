import java.util.Scanner;

class q11{
    public static void main (String[]args)
    {
        Scanner scan = new Scanner(System.in);
        int schlorship = scan.nextInt();

    if(schlorship > 7000)
    {
        System.out.println("eligible");
    }
    else{
        System.out.println("not eligible");
    }    
    }
}
