import java.util.Scanner;

public class RunningTotal {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    int current, total = 0;
    //for the while loop use current = 1 to meet the while condition

    System.out.print("Type in a bunch of values and I'll add them up. ");
    System.out.println("I'll stop when you type a zero.");

    // to use a while loop: while ( current != 0 ) {}

    do {
      System.out.print("Value: ");
      current = keyboard.nextInt();
      total += current;
      if ( current != 0) {
      System.out.println("The total so far is: " + total);
      }
    } while ( current != 0 );

    System.out.println("The final total is: " + total);
  }
}
