import java.util.Scanner;

public class ComputeFutureInvestmentValue {
  public static void main(String[] args) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);

    // Enter the investment amount
    System.out.print("Enter investment amount: ");
    double investmentAmount = input.nextDouble();

    // Enter annual interest rate in percentage
    System.out.print("Enter annual interest rate: ");
    double annualInterestRate = input.nextDouble();

    // Obtain monthly interest rate
    double monthlyInterestRate = annualInterestRate / 1200;

    // Enter number of years
    System.out.print("Enter number of years: ");
    int numberOfYears = input.nextInt();

    // Calculate Future Investment Value
    double accumulatedValue = investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfYears * 12);

    // Display Results
    System.out.println("The Accumulated Value Is $" + (int)(accumulatedValue * 100) / 100.0);
  }
}