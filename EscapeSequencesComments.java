public class EscapeSequencesComments {
  public static void main( String[] args ) {
    //This exercise demonstrates escape sequences & comments (like these)!
    System.out.print( "Learn\tJava\n\tthe\nHard\tWay\n\n" );
    System.out.print( "\tLearn Java the \"Hard\" Way!\n" );
    //System.out.frimp ("Learn Java the Hard Way" );
    System.out.print( "Hello\n" ); //This line prints Hello
    System.out.print( "Jello\by\n" ); //This line prints Jelly
    /* The quick brown fox jumped over a lazy dog.
       Quick wafting zephyers vex bold Jim. */
    System.out/* testing */ .println( "Hard to believe, eh?");
    System.out.println( "Suprized? /* abcde */ Or what did you expect?" );
    System.out.print/*Hello*/ln( "\\// _=_ \\//" );
    System.out.println( "\\\\ \\\\\\ \\\\\\\\" ); //It takes 2 to make 1
    System.out.print( "I hope you understand \"escape sequences\" now.\n ");
    // and comments. :)

/*The program itself compiled because the computer ignored the comment
that I inserted on line 13.  So, I will leave the comment because the program compiled.
I also wanted to state that my code on line one matches the code in the book but it looks a little different in my terminal.  "The" lines up with Java and Way. I was thinking I could add another /t in front of  Java and Way to make it look like the example.*/


  }
}
