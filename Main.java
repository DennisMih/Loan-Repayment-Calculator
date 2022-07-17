import java.io.InputStream;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello");

        System.out.print("Amouunt borrowed: ");
        int amount = scanner.nextInt();

        System.out.print("Anual Interest rate %: ");
        float interestRate = scanner.nextFloat();
        float interestMonth = interestRate / 100 / 12;
        // needs to be divided by 100 then divided by 12 to calculate monthly interest


        System.out.print("Period in years: ");
        byte loanTerm = scanner.nextByte();
        int numbOfPayemnts =  loanTerm * 12;
        // calculates how many payements required, gets number of years from loan then multiples by months in year to calculate monthly payments.

double repayement = amount
  * (interestMonth * Math.pow(1 + interestMonth, numbOfPayemnts))
        / (Math.pow(1 + interestMonth, numbOfPayemnts) - 1);

String repaymeentDisplay = NumberFormat.getCurrencyInstance().format(repayement);

        System.out.print("Amount borrowed:  " + amount);
        System.out.print("\tInterest rate:  " + interestRate);
        System.out.print("\tloan Term:  " + loanTerm + "\tyears");

        System.out.println("\nYour monthly repayment amount is: " + repaymeentDisplay);

    }
}
