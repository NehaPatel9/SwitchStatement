import java.util.Scanner;
//program to check whether a number is positive, negative or zero using switch case.
public class PositiveNegative {

        public static void main(String[] args) {

            System.out.println("Please enter any number");
            Scanner scanner=new Scanner(System.in);// create new object for Scanner class
            int num=scanner.nextInt();
            int i=0;

            if(num>0) i = 1;
            if(num==0) i = 0;
            if(num<0) i = 2;

            switch (i)
            {
                case 0:
                    System.out.println(num + " This number is zero");
                    break;
                case 1:
                    System.out.println(num + " This number is positive");
                    break;
                case 2:
                    System.out.println(num + " This number is negative");
                    break;
            }
        }
}
