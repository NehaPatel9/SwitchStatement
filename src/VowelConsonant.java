import java.util.Scanner;

//program to check whether an alphabet is vowel or consonant using switch case.
public class VowelConsonant {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // User can enter any alphabet from A to Z
        System.out.println("Please enter a character");
        char character = scanner.next().charAt(0);
        // Please enter an alphabet
        switch (character) {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                System.out.println("The entered character is " + character + " is  Vowel");
                break;
            default:
                System.out.println("The entered character is " + character + " is  Consonant");
                break;
        }

    }
}