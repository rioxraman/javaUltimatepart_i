import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final byte  MONTHS_IN_YEAR=12;
        final byte  PERCENT=100;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Principal : ");
        int principal = scanner.nextInt();
        System.out.println("anuula SI : ");
        float annualInterest=scanner.nextFloat();
        float monthlyInterest=annualInterest/PERCENT/MONTHS_IN_YEAR;
        System.out.println("TIME IN YEARS : ");
        byte years=scanner.nextByte();
        int noOfPayments = years * MONTHS_IN_YEAR;
        double mortgage = principal*(monthlyInterest*Math.pow(1+monthlyInterest,noOfPayments))/(Math.pow(1+monthlyInterest,noOfPayments));
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("morgage: "+mortgageFormatted);


    }
}