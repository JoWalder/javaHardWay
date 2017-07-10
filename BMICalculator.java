import java.util.Scanner;

public class BMICalculator {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner( System.in );
    double m, kg, bmi, in, pnds;

    System.out.print( "Your height in inches: " );
    in = keyboard.nextDouble();

    System.out.print( "Your weight in pounds: " );
    pnds = keyboard.nextDouble();

    m = in / 39.37;
    kg = pnds / 2.2;
    bmi = kg / (m*m);

    System.out.println(" Your BMI is " + bmi );
  }
}
