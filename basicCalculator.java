//Quería usar equals, pero descubrí que no existía para los char y quise priorizar hacer el ejercicio enrevesado,
// que me estaba gustando, perdón.

import java.util.Scanner;
//Quería usar equals, pero descubrí que no existía para los char y quise priorizar hacer el ejercicio enrevesado,
// que me estaba gustando, perdón.

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

        char option = scannerOperators();
        comparator (option);
    }


    //region Lectura
    public static char scannerOperators(){
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.print("Please, choose an operation ---> ");
        char option = sc.next().charAt(0);
        return option;
    }

    public static int [] scannerNumbers(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number ---> ");
        int a = sc.nextInt();

        System.out.print("Enter second number ---> ");
        int b = sc.nextInt();

        return new int[] {a,b};
    }


    //endregion

    //region Comparador
    public static void comparator(char option){
        while(option != '#'){
            if (option == '+'){
                int [] numbers = scannerNumbers();
                System.out.println(numbers[0]+ "+" + numbers [1] + "= " + (numbers[0]+ numbers[1]));
            } else if (option == '-'){
              int[] numbers = scannerNumbers();
              System.out.println( numbers[0] + "-" + numbers [1] + "= " +(numbers[0] - numbers[1]));
            }
        }
    }
    //endregion



}


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

        char option = scannerOperators();
        comparator (option);
    }


    //region Lectura
    public static char scannerOperators(){
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.print("Please, choose an operation ---> ");
        char option = sc.next().charAt(0);
        return option;
    }

    public static int [] scannerNumbers(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number ---> ");
        int a = sc.nextInt();

        System.out.print("Enter second number ---> ");
        int b = sc.nextInt();

        return new int[] {a,b};
    }


    //endregion

    //region Comparador
    public static void comparator(char option){
        while(option != '#'){
            if (option == '+'){
                int [] numbers = scannerNumbers();
                System.out.println(numbers[0]+ "+" + numbers [1] + "= " + (numbers[0]+ numbers[1]));


            }
        }
    }
    //endregion



}
