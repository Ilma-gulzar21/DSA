import java.util.Scanner;
public class TemperatureConversion {
  static void calsiusToFahrenheit(double celsius) {
          double fahrenheit = (celsius * 9/5) +32;
          System.out.println("Fahrenheit = " + fahrenheit + " F");
  }
  static void FahrenheitToCelsius(double Fahrenheit) {
        double celsius =( Fahrenheit -32) * 5/9;
        System.out.print("Celsius = " + celsius + " C");
  }
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Temperature in celcius = ");
    double Fahrenheit  = sc.nextDouble();
    calsiusToFahrenheit(Fahrenheit );

      System.out.print("Enter Temperature in Fahrenheit = ");
      double celsius = sc.nextDouble();
       FahrenheitToCelsius(celsius);
   sc.close();
}
}