package ie.atu;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        //create an instance of Calculator
        Calculator calc= new Calculator();


        System.out.println("Enter first number:");
        int firstNum= sc.nextInt();
        System.out.println("Enter second number:");
        int secondNum= sc.nextInt();


        System.out.println("Pick a operation, add, sub, mult or div");
        String operation = sc.next();

        double result =switch (operation)
        {
            case "add" ->
            {   yield  calc.add(firstNum,secondNum);
            }
            case "sub" ->
            {
                yield  calc.sub(firstNum,secondNum);
            }
            case "mult" ->
            {
                yield  calc.mult(firstNum,secondNum);
            }
            case "div" ->
            {
                yield  calc.div(firstNum,secondNum);
            }
            default ->
            {
                System.out.println("Invalid operation.");
                yield 0;
            }

        };
        System.out.println("The sum of the results is: "+result);
        sc.close();

    }
}
