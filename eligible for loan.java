import java .util.Scanner;
 
 class q17{
    public static void main(String []args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your salary");
        int salary = scan.nextInt();
        System.out.println("Enter your age");
        int age = scan.nextInt();
       
        if (salary>=20000 || age<=25)
        {
            System.out.println("you are eligible");
        System.out.println("Enter your loan amount");
        int loanamount = scan.nextInt();
        if (loanamount<=50000 )
        {
            System.out.println("loan is available");
        }
        else  {
            System.out.println("max amount is 50000");
        }
        }
        else {

            System.out.println("you are not eligible");
            }
        }
     }

    

 
