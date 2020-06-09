import java.util.Scanner;
//This is calculator with switch statement
public class Calculator {
    /* You can do Addition/Subtraction/
multiplication and division of any two number
 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Please enter integer numbers only
        System.out.println("Please Enter First Number");
        int num1 = scanner.nextInt();
        System.out.println("Please Enter Second Number");
        int num2 = scanner.nextInt();
        // Enter Arithmetic symbol as per your requirement
        System.out.println("Please Enter Arithmetic Symbol from + , - ,*, / ");
        String symbol = scanner.next();
        int result;
        switch (symbol){
            case "+":result=num1 + num2;
                System.out.println("This is addition of: " + num1 + " and " + num2 + " = " + result);
                break;
            case "-":result=num1 - num2;
                System.out.println("This is subtraction of: " + num1 + " and " + num2 + " = " + result);
                break;
            case "*":result=num1 * num2;
                System.out.println("This is multiplication of: " + num1 + " and " + num2 + " = " + result);
                break;
            case "/":result=num1 / num2;
                System.out.println("This is division of: " + num1 + " and " + num2 + " = " + result);
                break;
        default:
                System.out.println("This is invalid entry");
                break;
        }
    }
}
