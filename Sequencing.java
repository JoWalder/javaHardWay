import java.util.Scanner;

public class Sequencing {
  public static void main( String[] args ) {
    // THIS CODE IS BROKEN UNTIL YOU FIX IT

    Scanner keyboard =  new Scanner(System.in);
    double price, salesTax, total;

  System.out.print( "How much is the purchase price? ");
  price = keyboard.nextDouble();
  salesTax = price * 0.0825;
  total = price + salesTax;

  System.out.println( "Item price:\t" + price );
  System.out.println( "Sales tax:\t" +salesTax );
  System.out.println( "Total cost:\t" + total );

  /* 1. There is no value to define price so it stops compling because it cannot complete the rest of what the program is asking.
  2. The program works as expected.
  3. No error, The program worked correctly.  I was not suprised because salesTax and total are defined after the
  user is asked how much the price was.  This gave the value of price to run salesTax and total correctly.
*/
  }
}
