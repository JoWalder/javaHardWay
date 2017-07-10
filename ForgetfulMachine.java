import java.util.Scanner;

public class ForgetfulMachine {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);

    System.out.println( "What city is the capital of France?" );
    keyboard.next();

    System.out.println( "What is 6 multiplied by 7?" );
    keyboard.nextInt();

    System.out.println( "Enter a number between 0.0 and 1.0." );
    keyboard.nextDouble();

    System.out.println( "Is there anything else you would like to say?" );
    keyboard.next();

    /* The second question blows up when I type a double or a string into it. This happens because the value is set to
    nextInt() and that will only deal with and display a int type of value.


    The third question only blows up when I put a string in for an answer.  This happens because when you set keyboard.nextDouble() the computer will only accept a numerical value not something that contains a letter or a string.*/


  }
}
