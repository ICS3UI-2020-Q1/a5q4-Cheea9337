import java.util.Scanner;
/**
 *
 * @author Aidan Cheesmond
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    // ask the user for their balance
    System.out.println("Please enter a starting balance");
    double balance = input.nextInt();

    // ask the user for their interest rate
    System.out.println("Please enter your interest rate");
    double interest = input.nextInt();

    // ask the user for the number of years they will invest for
    System.out.println("Please enter the number of years you will invest for");
    int years = input.nextInt();

    double sum = 1;
    double interestRate;
    for(int count = 1; count <= years; count++){
      interestRate = interest/100;
      sum = balance * interestRate;
      balance = balance + sum;
    }
    // tell the user their final balance
    System.out.println("Your final balance would be " + "$" + balance);
    
  }
}
