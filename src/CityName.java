/* Input any alphabet from a to f and
print their city name accordingly
any other alphabet should be invalid entry*/

import java.util.Scanner;

public class CityName {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter City Character");
        String cityChar = scanner.next();
        switch (cityChar){
            case "A": case "a":
            System.out.println("Aberdeen");
            break;
            case "B": case "b":
            System.out.println("Birmingham");
            case "C": case"c":
            System.out.println("Cambridge");
            case "D": case "d":
            System.out.println("Derby");
            case "E": case "e":
            System.out.println("Edinburgh");
            case "F": case "f":
            System.out.println("Farnborough");
            default:
            System.out.println("Invalid Entry");
        }
    }
}
