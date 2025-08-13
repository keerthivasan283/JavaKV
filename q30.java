import java.util.Scanner;

class q30{

    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = scan.nextInt();

        int []marks = new int[size];
        System.out.println("enter" + size + "elements");
        for(int i=0; i<=size-1;i=i+1)
        {
            marks[i] = scan.nextInt();
        }

        int middleIndex = size/2;
        System.out.println("Middle element: " + marks[middleIndex]);

    }
}