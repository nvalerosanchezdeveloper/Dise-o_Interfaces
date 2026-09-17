import java.util.Scanner;


public class Main {
    public static void main (String[] args){

        System.out.printf("FOR USERS:\n 
        --- OPTIONS ARE SET AS NUMBERS FROM 1 - 5 ---\n
        OPTION 1: Addition (+)\n
        OPTION 2: Substraction (-)\n
        Option 3: Multiplication (*)\n
        Option 4: Division (/)\n
        Option 5: End\n");
        scanner();

    }

    public static void scanner(){
        Scanner sc = new Scanner(System.in);

        System.out.println();

        System.out.println("Enter first number ---> ");
        int a = sc.nextInt();

        System.out.println("Enter second number ---> ");
        int b = sc.nextInt();

        System.out.println("Choose an operation ---> ");

    }
}