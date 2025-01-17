import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        

        int p = 0;
        double annualInterest1 =0;
        double prd = 0;
        double aI = 0;
        double prd1 = 0;

            System.out.println("Mortgage Calculator ");

            while(true){
                System.out.printf("Principal ($1K-$1M): ");
                p = scanner.nextInt();

                if ((p >= 1000) && (p <= 1000000))
                    break;
                    System.out.println("Please enter a value between 1,000 and 1,000,000.");
            }

            while(true) {
                System.out.printf("Annual Interest: ");
                annualInterest1 = scanner.nextDouble();
                aI = (annualInterest1 / 100) / 12;

                if ((annualInterest1 >= 0) && (annualInterest1 <= 30))
                    break;
                System.out.println("Please enter a value between 1 and 30.");
            }

            while(true) {
                System.out.printf("Period (Years): ");
                prd = scanner.nextInt();
                prd1 = prd * 12;

                if ((prd >= 0) && (prd <= 30))
                    break;
                System.out.println("Please enter a value between 1 and 30.");
            }

            double prtss = 1 + aI;

            double topdiv = aI * (Math.pow(prtss, prd1));
            double botdiv = (Math.pow(prtss, prd1) - 1);

            double div = topdiv / botdiv;

            double result = p * div;

            NumberFormat currency = NumberFormat.getCurrencyInstance();
            String finalResult = currency.format(result);

            //System.out.println(p);
            //System.out.println(aI);
            //System.out.println(prd1);

            System.out.println("Mortgage: " + finalResult);

    }
}
