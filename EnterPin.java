import java.util.Scanner;

public class EnterPin {
  public static void main( String[] args ) {
  Scanner keyboard = new Scanner(System.in);
  int pin, entry2;
  String password, entry;

    password = "hunter2";
    pin = 12345;

  System.out.println("WELCOME TO THE BANK OF JAVA" );
  System.out.print("ENTER YOU Password: ");
  entry = keyboard.next();

  while ( ! entry.equals(password) ) {
    System.out.println( "\nINCORRECT PASSWORD. TRY AGAIN." );
    System.out.print( "ENTER YOUR PASSWORD: " );
    entry = keyboard.next();
    }

    System.out.print( "\nPASSWORD ACCEPTED, ENTER YOUR PIN: ");
    entry2 = keyboard.nextInt();

    while ( entry2 != pin) {
      System.out.println("\nINCORRECT PIN. TRY AGAIN." );
      System.out.print("ENTER YOUR PIN: " );
      entry2 = keyboard.nextInt();
    }

    System.out.println("\nPIN ACCEPTED. YOUR ACCOUNT IS 425.17");


  }
}
