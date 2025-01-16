import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("FizzBuzz (Buzz in my Fizz)");
        System.out.printf("Enter a Number (to Buzz or Fizz, or BOTH!): ");
        int num = scanner.nextInt();
        boolean fizz = false;
        boolean buzz = false;



        if ((num % 5 == 0) && (num % 3 == 0)) { //to make this work put the most specific condition at the top and generic ones at the bottom
            fizz = true;
            System.out.println("FizzBuzz");
        }
        else if (num % 3 == 0) {
            buzz = true;
            System.out.println("Buzz");
        }
        else if (num % 5 == 0){
            System.out.println("Fizz");
        }
        else
            System.out.println(num);
    }
}