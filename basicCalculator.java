import java.util.Scanner;


public class Main {
    public static void main (String[] args){

        char [] operators = {'+','-','*','/','#'};

        System.out.printf("[--------------=== FOR USERS ===--------------]\n\n" +
                        "|--- OPTIONS ARE SET AS NUMBERS FROM 1 - 5 ---|\n" +
                        "|---        OPTION 1: Addition (+)         ---|\n" +
                        "|---        OPTION 2: Substraction (-)     ---|\n" +
                        "|---        Option 3: Multiplication (*)   ---|\n" +
                        "|---        Option 4: Division (/)         ---|\n" +
                        "|---        Option 5: End (#)              ---|\n" );
                        scanner();
    }

    //region Lectura
    public static void scanner(){
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.print("Please, choose an operation ---> ");
        int option = sc.nextInt();

        System.out.print("Enter first number ---> ");
        int a = sc.nextInt();

        System.out.print("Enter second number ---> ");
        int b = sc.nextInt();
    }
    //endregion



}
