import java.util.Scanner;

class q15
{

    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        int sub1 = scan.nextInt();
        int sub2 = scan.nextInt();
        int sub3 = scan.nextInt();
        int sub4 = scan.nextInt();
        int sub5 = scan.nextInt();

        int sub6 = sub1+sub2+sub3+sub4+sub5;
        int Avg = sub6/5;


        if(Avg<35)
        {
            System.out.println("you need to attend the class");
        }
        else{
            System.out.println("You are good to go");
        }

    }
}
