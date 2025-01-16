import java.awt.*;
import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Basics of Java
        //Primitive types

        /*
        byte myAge = 69;
        int herAge = myAge;

        long viewsCount = 6_987_654_321L;
        float price = 10.99F;

        char letter = 'A';

        boolean isEligible = true;
        */

        //Reference types

        /*
        byte age = 30;
        Date now = new Date();
        */

        //Primitive type vs. Reference type

        /*
        Point point1 = new Point(1, 1);
        Point point2 = point1;

        point1.x = 2;
        */

        //Strings

        /*
        String message = " Hello World " + " !! ";


        System.out.println(message.startsWith("H"));
        System.out.println(message.endsWith("H"));
        System.out.println(message.length());
        System.out.println(message.indexOf("H"));
        System.out.println(message.indexOf("a"));
        System.out.println(message.replace("!", "*"));
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());
        */

        //Escape Sequence

        /*
        String message = "Hello \"World\""; // uses backslash to display double quotes in a string
        String message1 = "C:\\Windows\\...";
        String message2 = "C:\nWindows\\..."; //adds a new line
        String message3 = "C:\tWindows\\..."; //adds a tab in the String
        System.out.println(message3);
        */

        //Arrays

        /*
        int[] numbers = new int[5]; //old sytax
        numbers[0] = 1;
        numbers[1] = 2;

        System.out.println(Arrays.toString(numbers));

        int[] numbers1 = {2, 3, 5, 1 ,4};

        System.out.println(numbers1.length);
        Arrays.sort(numbers1);
        System.out.println(Arrays.toString(numbers1));
        */

        //Multi-Dimensional Arrays

        /*
        int [][] numbers = new int [2][3]; //2D Array
        numbers[0][0] = 1;
        System.out.println(Arrays.deepToString(numbers));

        int [][] numbers1 = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(Arrays.deepToString(numbers1)); // 3D Array
        */

        // Constants

        /*
        final float PI = 3.14F;
        pi = 1;
        */

        //Arithmetic Expressions

        /*
        int result = 10 + 3;
        double result1 = (double)10 / (double)3;

        int x = 1;

        int y = x + 2;
        // or x +=2;

        System.out.println(result);
        System.out.println(result1);
        System.out.println(x);
        System.out.println(y);
         */

        //Order of Operations

        /*
        int x = (10 + 3) * 2;         //PEMDAS (Parentheses, Exponents, Multiplication, Division, Addition, Subtraction )
        System.out.println(x);      //for the order
        */

        //Casting

        /*
        double x = 1.1; // Implicit Casting (Automatic Conversion i.e. byte > short, int > long, float > double)
        int y = (int)x + 2; // Explicit Casting (Manual Conversion)
        System.out.println(y);

        String z = "1.1";
        double c = Double.parseDouble(z) + 2;
        System.out.println(c);
         */

        //The Math Class

        /*
        int result = (int)Math.round(1.1F);
        int result1 = (int)Math.ceil(1.1F);
        int result2 = (int)Math.floor(1.1F);
        int result3 = Math.max(1, 2);
        int result4 = Math.max(1, 2);
        int result5 = (int)Math.round(Math.random() * 100);
        int result6 = (int) (Math.random() * 100);

        System.out.println(result6);
         */

        //Formatting Numbers

        /*
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1234567.891);
        System.out.println(result);

        NumberFormat percent = NumberFormat.getPercentInstance();
        String result1 = percent.format(0.1);
        System.out.println(result1);

        String result2 = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(result2);

        */

        // Reading User Input

        /*
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);


        System.out.printf("Age: "); //inline print
        byte age = scanner.nextByte(); //.nextDouble or .nextFloat to read decimals for what ever reason
        System.out.println("You are " + age); //new line print

        System.out.printf("Name: ");
        String name = scanner1.nextLine().trim(); // chaining methods to remove white space in user input
        System.out.println("You're " + name);
        */

        /*
        if (age <= 17) {
            System.out.println("You are " + age + " years old");
            System.out.println("You small ahh baby");
        }
        else if (age >= 18) {
            System.out.println("You are " + age + " years old");
            System.out.println("You old fuck");
        }*/

        // Comparison Operators

        /*
        int x = 1;
        int y = 2;

        System.out.println(x != y); // Boolean
        System.out.println(x == y);
        System.out.println(x <= y);
        System.out.println(x >= y);
         */

        //Logical Operators

        /*
        int temperature = 12;
        boolean isWarm = temperature > 20 && temperature < 30; //AND Operator (needs both conditions to be true)
        System.out.println(isWarm);

        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord; //OR Operator (only needs one condition to be true to count)
        System.out.println(isEligible);
         */

        //If Statements

        /*
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the Temperature today?");
        int temp = scanner.nextInt();

        if (temp > 30){
            System.out.println("It's hot today");
            System.out.println("Drink plenty of water bitch");
        }

        else if (temp >= 20 && temp <= 30) {
            System.out.println("It's a nice day, Today");
        }

        else if (temp < 20 ) {
            System.out.println("It's fockin cold mate");
        }
        */

        //Simplifying If statements

        /*
        int income = 120_000;
        boolean hasHighIncome = (income > 100_000);

        System.out.println(hasHighIncome);
        */

        //The Ternary Operator

        /*
        int income = 10_000;
        String className = income > 100_000 ? "First" : "Economy";

        System.out.println(className);
         */

        //Switch Statements

        /*
        Scanner scanner = new Scanner(System.in);

        System.out.printf("What is your role?: ");
        String role = scanner.nextLine();

        switch (role){
            case "Admin":
                System.out.println("You are an " + role);
                break;
            case "Moderator":
                System.out.println("You are an " + role);
                break;
            default:
                System.out.println("You're a Guest");
        }


        if (role == "Admin"){
            System.out.println("You are an " + role);
        }
        else if (role == "Moderator") {
            System.out.println("You are an " + role);
        }
        else
            System.out.println("You are a Guest");
         */

        //For Loops

        /*
        for(int i = 0; i < 5; i++){
        System.out.println("Hello World");
        }
        for(int a = 1; a <= 5; a++){
            System.out.println("Hello World " + a); // prints the the int in ASC format
        }
        for(int b = 5; b > 0; b--){
            System.out.println("Hello World " + b); // prints the the int in DESC format
        }
        */

        //While Loops

        /*
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while(!input.equals ("quit")) {
            System.out.printf("Input: ");
            input = scanner.nextLine().toLowerCase(); //turns the input "quit" into smaller letters to avoid case sensitivity
            System.out.println(input);
        }
         */

        //Do... While Loops

        /*
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while(!input.equals ("quit")) {
            System.out.printf("Input: ");
            input = scanner.nextLine().toLowerCase();
            System.out.println(input);
        }

        do { //Rare to use but a substitute for While loops
            System.out.printf("Input: ");
            input = scanner.nextLine().toLowerCase();
            System.out.println(input);
        }
        while (!input.equals("quit"));

         */

        //Break and Continue

        /*
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while(true) {
            System.out.printf("Input: ");
            input = scanner.nextLine().toLowerCase();

            if (input.equals ("pass"))
                continue; //resumes the program to the beginning

            if (input.equals ("quit"))
                break; //stops the entire program

            System.out.println(input);
        }

         */

        //For Each Loop

        /*

        String[] fruits = {"Apple", "Mango", "Orange"};

        for (int i = 0; i < fruits.length; i++)
            System.out.println(fruits[i]);

        for (String fruit : fruits) //Much easier loop to use on Arrays, but it has limitations like unable to loop the array backwards
            System.out.println(fruit);

         */
    }
}
