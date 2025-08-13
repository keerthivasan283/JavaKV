import java.util.Scanner;

class q5{
    public static void main (String args[])
    {
        Scanner Scan = new Scanner (System.in);
        String name = Scan.nextLine();
        Double marks = Scan.nextDouble();
        Scan.nextLine();
        String dept = Scan.nextLine();

        System.out.println("my name is "+name);
        System.out.println("my marks is "+marks/10 +"/10");
        System.out.println("my dept is " +dept);

    }

}