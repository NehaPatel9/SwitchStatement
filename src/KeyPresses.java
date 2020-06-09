import java.util.Scanner;
/* This program is to detect key presses.If the user pressed number keys( from 0 to 9),
the program will tell the number that is pressed, otherwise, program will show "Not allowed".
 */
public class KeyPresses {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        //Please enter a number from 0 to 9
        System.out.println("Please Enter a Number");
        int keyNum = scanner.nextInt();
            switch (keyNum) {
                case 0:
                    System.out.println("The number you pressed is 0");
                    break;
                case 1:
                    System.out.println("The number you pressed is 1");
                    break;
                case 2:
                    System.out.println("The number you pressed is 2");
                    break;
                case 3:
                    System.out.println("The number you pressed is 3");
                    break;
                case 4:
                    System.out.println("The number you pressed is 4");
                    break;
                case 5:
                    System.out.println("The number you pressed is 5");
                    break;
                case 6:
                    System.out.println("The number you pressed is 6");
                    break;
                case 7:
                    System.out.println("The number you pressed is 7");
                    break;
                case 8:
                    System.out.println("The number you pressed is 8");
                    break;
                case 9:
                    System.out.println("The number you pressed is 9");
                    break;
                default:
                    System.out.println("Not Allowed");
                    break;
            }
    }

}
