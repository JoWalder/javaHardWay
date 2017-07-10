import java.util.Scanner;

public class RudeQuestions {
  public static void main( String[] args ) {
    String name;
    int age;
    double weight, income, height; // New

    Scanner keyboard = new Scanner(System.in);

    System.out.print( "Hello. What is your name? " );
    name = keyboard.next();

    System.out.print( "Hi, " + name + "! How old are you? " );
    age = keyboard.nextInt();

    System.out.println( "So you're " + age + ", eh? That's not very old." );
    System.out.print( "How much do you weigh, " + name + "? " );
    weight = keyboard.nextDouble();

    System.out.println( weight + "! Better keep that quiet!!" );

    System.out.print( "Okay, so how tall are you, " + name + "? " );// New
    weight=keyboard.nextDouble();

    System.out.println( "Thats not very tall." ); //statement to go with New ?
    System.out.print( "Finally, what is your income, " + name +"? " );
    income=keyboard.nextDouble();


    System.out.print( "Hopefully that is  "  + income + " per hour");
    System.out.println( " and not per year!" );
    System.out.print( "Well, thanks for answering my rude questions, " );
    System.out.println(  name + "." );

    /* 1.  The program does not blow up if you enter an integer value when
    it is expecting a double.  My guess as to why the program will except a int
    value in place of a double value is that the program sees them both as
    numbers.  Also, when you put  an int value in for a double I noticed that
    value returned has a .0 added on to it, so it is shown in decimal form.

    2.  No, the program does not blow up when you put a numerical value, such as
    an integer or double, into a string.  I believe this is because the computer
    packages all input into " " and if a number is in between the quotes in a string it
    will be acceptable.

    3. First question: Nothing will blow this up because the varible is a string.
    Second question:  A string and a doulbe will blow the program up because the
    variable is set to integer.  It will only accept rational numbers.
    Thrid question:  A string will blow the program because the variable is
    set to double.  This means it will only accept numeric values.
    Fouth question:  A string will blow the program up because, like above, the
    variable is set to double, which will only accept numeric values.

    4.  I will annotate the new variable and question with // New.  */
      }
}
