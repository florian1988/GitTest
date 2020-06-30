import java.util.Scanner;

public class FMethodsB1 {

    static void weather(){
        double celsius, fahrenheit;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit:");
        fahrenheit = s.nextDouble();
        celsius = (fahrenheit-32) * (0.5556);
        System.out.println("Temperature in Celsius:" + celsius);
    }

        public static void main(String[] args)
        {
           weather();
        }
}

//Outcome:
//Enter temperature in Fahrenheit:5
//Temperature in Celsius:-15.001199999999999
//
//Process finished with exit code 0