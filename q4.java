import  java.util.Scanner;

class q4 {
    public static void main(String args[])
    {
        Scanner Scan = new Scanner (System.in);
        int a = Scan.nextInt();
        int b = Scan.nextInt();
        int c = Scan.nextInt();
        int d = a*b*c;
        int e = a+b+c;
        
        System.out.println( d/e);
    }

}