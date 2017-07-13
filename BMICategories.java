import java.util.Scanner;

public class BMICategories {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    double bmi, m, kg, in, ft, lb, total;

    System.out.print( "What is your height (feet only): ");
    ft = keyboard.nextDouble();

    System.out.print( "Your height (inches) : ");
    in = keyboard.nextDouble();

    System.out.print( "Your weight (pounds): ");
    lb = keyboard.nextDouble();

    total = ft * 12 + in;
    m = total / 39.37;
    kg = lb / 2.2;
    bmi = kg / (m*m);

    System.out.println( "Your BMI is: " + bmi );
    System.out.print( "BMI category: " );
    if ( bmi < 15) {
      System.out.println( "very seriously underweight" );
    }
    else if (bmi <= 16.0 ) {
      System.out.println( "seriously underweight" );
    }
    else if ( bmi < 18.5 ) {
      System.out.println( "underweight" );
    }
    else if ( bmi < 25.0 ) {
      System.out.println( "normal weight" );
    }
    else if ( bmi < 30.0 ) {
      System.out.println( "overweight" );
    }
    else if ( bmi < 35.0) {
      System.out.println( "moderately obese" );
    }
    else if ( bmi < 40 ) {
      System.out.println( "severly obese" );
    }
    else {
      System.out.println( "very severly/\"morbidly\" obese" );
    }
  }
}
