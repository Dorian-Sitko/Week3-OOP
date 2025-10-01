package ie.atu;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        //create an instance of Calculator
        Calculator calc= new Calculator();

        System.out.println("Simple Calculator- Add Two Numbers");
        System.out.println("Enter first number:");
        int firstNum= sc.nextInt();
        System.out.println("Enter second number:");
        int secondNum= sc.nextInt();
        int result = calc.add(firstNum,secondNum);
        System.out.println("Result:"+result);

        sc.close();

    }
}
