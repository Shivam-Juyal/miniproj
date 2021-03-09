import java.lang.*;
import java.util.*;
import java.util.InputMismatchException;



public class Calculator {
    Calculator(){
        //constructor
    }


    public static void main(String[] args)
    {
        Calculator obj1 = new Calculator();
        Scanner scn = new Scanner(System.in);



        do {
            System.out.println("----------Scientific Calculator----------");
            System.out.println("Choose any one of the following option...");
            System.out.println("1: Find Square Root");
            System.out.println("2: Find Factorial!");
            System.out.println("3: Find Natural logarithm (ln(x))");
            System.out.println("4: Find (a^b)");
            System.out.println("5: Exit.");

            int input;
            try
            {
                input = scn.nextInt();
            }
            catch (InputMismatchException error)
            {
                return;
            }

            switch (input)
            {
                case 1:
                    /*ask for input and find the square root.*/

                    System.out.println("Enter number to find Square Root.");
                    double num;
                    try{
                        num = scn.nextDouble();
                    }catch (InputMismatchException error){
                        return;
                    }
                    if(num<0){
                        System.out.println("Negative numbers and letters should not be entered!");
                        return;
                    }
                    System.out.println("Square root of "+num+" is : " + Calculator.findSquareRoot(num));
                    break;

                case 2:
                    /* ask for input and calculate the factorial.*/
                    System.out.println("Enter number to find factorial.");

                    int number;
                    try
                    {
                        number = scn.nextInt();
                    }
                    catch (InputMismatchException error)
                    {
                        return;
                    }

                    System.out.println("Factorial of "+number+" is : " + Calculator.findFactorial(number));
                    break;



                case 3:
                    /*ask for input and find the natural logarithm*/
                    System.out.println("Enter num to find ln(num).");
                    double a;
                    try
                    {
                        a = scn.nextDouble();
                    }
                    catch (InputMismatchException error)
                    {
                        return;
                    }

                    if(a<0){
                        System.out.println("Negative numbers should not be entered!");
                        return;
                    }
                    System.out.println("Natural Logarithm of "+a+" is : " + Calculator.findNaturalLog(a));
                    break;




                case 4:
                    /*ask for inputs and find a^b*/

                    System.out.println("Enter base and exponent to find base^exponent.");
                    double base;
                    double exponent;
                    try
                    {
                        base = scn.nextDouble();
                    }
                    catch (InputMismatchException error)
                    {
                        return;
                    }

                    try
                    {
                        exponent = scn.nextDouble();
                    }
                    catch (InputMismatchException error)
                    {
                        return;
                    }

                    if(base==0)
                    {
                        System.out.println("Base cannot be equal to 0!");
                        return;
                    }
                    System.out.println(base+" ^ "+exponent+" is : "+ Calculator.findPower(base,exponent));
                    break;

                case 5:
                    System.out.println("Exiting....");
                    return;
            }
        } while (true);
    }

    public static double findSquareRoot(double num){
        return Math.sqrt(num);
    }

    public static int findFactorial(int num){
        if(num==2)return 2;
        int fact =num*findFactorial(num-1);
        return fact;
    }

    public static double findNaturalLog(double num) {
        return Math.log(num);
    }

    public static double findPower(double base, double exponent){
        return Math.pow(base,exponent);
    }


}

