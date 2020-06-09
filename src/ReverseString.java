import java.util.Scanner;
public class ReverseString {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter string");
            String str = scanner.next();
            StringBuilder sb = new StringBuilder(str);
            str = sb.reverse().toString();
            System.out.println("Reversed String : " + str);
    }
}
