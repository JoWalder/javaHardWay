import java.util.Scanner;

public class AgeMessages {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    int age;

    System.out.print( "How old are you? " );
    age = keyboard.nextInt();

    System.out.println( "You are: " );
    if ( age < 13 ) {
      System.out.println( "\ttoo young to create a Facebook account" );
    }
    if ( age >= 13 ){
      System.out.println( "\told enough to create a Facebook account" );
    }
    if ( age < 16 ) {
      System.out.println( "\ttoo young to get a driver's license" );
    }
    if ( age >= 16 ){
      System.out.println( " \told enough to get a drivers license" );
    }
    if ( age < 18 ) {
      System.out.println( "\ttoo young to get a tattoo" );
    }
    if ( age >= 18 ) {
      System.out.println( "\told enoough to get a tattoo" );
    }
    if ( age < 21 ) {
      System.out.println( "\ttoo young to drink alcohol" );
    }
    if ( age >= 21 ) {
      System.out.println( "\told enough to drink alcohol" );
    }
    if ( age < 35 ) {
      System.out.println( "\ttoo young to run for president" );
    }
    if ( age >= 35 ) {
      System.out.println( "\told enough to run for president" );
    }
    if ( age >=65 ) {
      System.out.println( "\tYou are old enough to retire!");
      System.out.println( "\t\t(Enjoy retirement!)" );
    }
    if ( age <= 64 ) {
      System.out.println( "\ttoo young to retire" );
      System.out.println( "\t\t(How Sad!)" );
    }
  }
}
/* 1. If you print an age over 35 none of the statements print because the answer
all the statements is false. The only statements that show up are the ones that are not
tied to the if statements.
2. see retirement statement
3. Added statements

*/
