import java.util.Scanner;

public class OddEven {
    //This programme is for Ternary Operator
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Check first value entered is Odd or even
        System.out.println("Please enter number");
        int number = scanner.nextInt();
        int result= number%2;

        switch (result) {
            case 0:
                System.out.println("The Number Entered is Even" );
                break;
            default:
                System.out.println("The Number Entered is Odd");
                break;

        }
    }
}