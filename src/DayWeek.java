import java.util.Scanner;
/*This program to print day of week (example Sunday, Monday Tuesday etc.).
 User should able to enter number between 1-7 & week start from Sunday.
If user enters anything else then output should be “Invalid choice".*/

public class DayWeek {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number : "); // condition for numbers between 1 to 7
        int enterNumber = scanner.nextInt();

        switch (enterNumber){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
            break;
            case 3:
                System.out.println("Tuesday");
            break;
            case 4:
                System.out.println("Wednesday");
            break;
            case 5:
                System.out.println("Thursday");
            break;
            case 6:
                System.out.println("Friday");
            break;
            case 7:
                System.out.println("Saturday");
            break;
            default:
                System.out.println("Invalid choice");
            break;
            }
        }
}
