import java.util.Scanner;

class q18{

    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
     
       int greater = (num1 > num2) ? num1 :num2;
       
        System.out.println("the greatest number is"+ greater);






    }
}

