import java.util.Scanner;

class q12{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

    if(num % 3 == 0 && num % 5 == 0)
    {
        System.out.println("is divisible");
    }    
    else{
        System.out.println("is not divisible");
    }

    }
}
