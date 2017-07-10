import java.util.Scanner;

public class BMICalculator2 {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner( System.in );
    double m, kg, bmi, in, ft, pnds, total;

    System.out.print( "Your height (feet only): " );
    ft = keyboard.nextDouble();

    System.out.print( "Your height (inches): " );
    in = keyboard.nextDouble();

    System.out.print( "Your weight in pounds: " );
    pnds = keyboard.nextDouble();

    total = ft * 12 + in;
    m = total / 39.37;
    kg = pnds / 2.2;
    bmi = kg / (m*m);

    System.out.println(" Your BMI is " + bmi );
  }
}
