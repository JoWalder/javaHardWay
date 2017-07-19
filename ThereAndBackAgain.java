public class ThereAndBackAgain {
  public static void main( String[] args ) {
    System.out.println( "Here." );
    erebor();
    System.out.println( "Back first time." );
    erebor();
    System.out.println( "Back second time." );
  }

  public static void erebor() {
    System.out.println( "There." );
  }
}
/*I think that line 5 and line 7 will print and finish the main() without
there printing inbetween them because we commented out the erebor();

I was right :)*/
