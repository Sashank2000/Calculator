package cal;
import java.util.Scanner;
import java.lang.Math;
public class Calculator {
    public double SquareRoot(double x)
    {
//        logger.info("Answer: "+ Math.sqrt(x));
        return Math.sqrt(x);
    }
    public int factorial(int x)
    {
        int fact = 1;
        for(int i=2;i<=x;i++)
        {
            fact = fact*i;
        }
//        logger.info("Answer: " + fact);
        return fact;
    }

    public double log(double x)
    {
//        logger.info("Answer: " + Math.log(x));
        return Math.log(x);
    }

    public double power(double x , double y)
    {
//        logger.info("Answer: " + Math.pow(x, y));
        return Math.pow(x, y);
    }
    public void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int menu = 0;
        while (menu < 5) {
            System.out.println("Select Operation: ");
            System.out.println("1. Square Root(x^2)");
            System.out.println("2. Factorial(x!)");
            System.out.println("3. Logarithm(log(x))");
            System.out.println("4. Power(x^y)");
            System.out.println("5. Exit");

            menu = scan.nextInt();
            if (menu == 1) {
                System.out.println("Enter x: ");
                int x = scan.nextInt();
                System.out.println("Answer: " + SquareRoot(x));
            } else if (menu == 2) {
                System.out.println("Enter x: ");
                int x = scan.nextInt();
                System.out.println("Answer: " + factorial(x));
            } else if (menu == 3) {
                System.out.println("Enter x: ");
                int x = scan.nextInt();
                System.out.println("Answer: " + log(x));
            } else if (menu == 4) {
                System.out.println("Enter x: ");
                int x = scan.nextInt();
                System.out.println("Enter y: ");
                int y = scan.nextInt();
                System.out.println("Answer: " + power(x, y));
            }
        }
    }
}