import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        int operator, num1, num2;
        System.out.println(" 1 - ADD \n 2 - SUB  \n 3 - MULTIPLY \n 4 - DIVISION");
        System.out.println(" CHOOSE AN OPERATOR: ");
        Scanner sc = new Scanner(System.in);
        operator = sc.nextInt();
        System.out.println("ENTER THE VLALUE OF NUM 1 :");
        num1 = sc.nextInt();
        System.out.println("ENTER THE VLALUE OF NUM 2 :");
        num2 = sc.nextInt();
        int result = 0;
        switch (operator) {
            // CASE 1 FOR ADDITON OF TWO NUMBERS
            case 1:
                result = num1 + num2;
                break;
            // CASE 2 FOR SUNSTRACTION OF TWO NUMBERS
            case 2:
                result = num1 - num2;
                break;
            // CASE 1 FOR MULTIPLY OF TWO NUMBERS
            case 3:
                result = num1 * num2;
                break;
            // CASE 1 FOR DIVISION OF TWO NUMBERS
            case 4:
                result = num1 / num2;
                break;
            // WHEN USER GIVE WRONG OPERTOR DEFAULT WILL WORK
            default:
                System.out.println("PLEASE ENTER A VALID OPERATOR.");
        }
        System.out.println(" THE RESULT IS : " + result);
    }

}
