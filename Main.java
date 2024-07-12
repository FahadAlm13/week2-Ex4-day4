import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q1) Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of
        //two numbers, takes two numbers as input .

//        try {
//            System.out.println("Enter your first number : ");
//            int num1 = sc.nextInt();
//            System.out.println("Enter your second number : ");
//            int num2 = sc.nextInt();
//
//            int sum = num1 + num2;
//            int diff = num1 - num2;
//            int product = num1 * num2;
//            int division = num1 / num2;
//            int remainder = num1 % num2;
//            System.out.println("Expected output :  ");
//            System.out.println(num1 + " + " + num2 + " = " + sum);
//            System.out.println(num1 + " - " + num2 + " = " + diff);
//            System.out.println(num1 + " * " + num2 + " = " + product);
//            System.out.println(num1 + " / " + num2 + " = " + division);
//            System.out.println(num1 + " % " + num2 + " = " + remainder);
//        } catch (InputMismatchException  e) {
//            System.out.println("Please enter Integer number :");
//        }catch (ArithmeticException e){
//            System.out.println(e.getMessage());
//        }finally {
//            System.out.println("Working fine");
//        }
//    }


        //Q2)  Write a Java program that takes a number as input and prints its multiplication table up to 10.
        //Test Data:

//        try {
//            System.out.println("Please write a number : ");
//            int num = sc.nextInt();
//            printMultiplicationTable(num);
//        }catch(IllegalArgumentException e){
//            System.out.println(e.getMessage());
//        }


        //Q3) Write a Java program to print the area and perimeter of a circle.
//        try {
//            System.out.println("Enter your Radius number : ");
//            double radius = sc.nextDouble();
//            printCircleProperties(radius);
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        }


        // Q4) Java program to find out the average of a set of integers
//        try {
//            System.out.println("Please enter number of Integer : ");
//            int n = sc.nextInt();
//            double avr = calculateAverage(sc, n);
//            System.out.println("The average is :" + avr);
//        } catch (InputMismatchException e){
//            System.out.println("Enter Integer number  ");
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }


        // Q5) Write a Java program that accepts three integers as input, adds the first two integers
        //together, and then determines whether the sum is equal to the third integer.

//        try {
//            System.out.println("Please write three Integer ");
//            System.out.println("First number : ");
//            int num = sc.nextInt();
//            System.out.println("Second number : ");
//            int num2 = sc.nextInt();
//            System.out.println("Third number :");
//            int num3 = sc.nextInt();
//            int sum = num + num2;
//            boolean equal = true;
//
//            if (sum != num3) {
//                equal = false;
//                System.out.println("The result is:" + equal);
//            } else System.out.println("The result is:" + equal);
//        } catch (InputMismatchException e) {
//            System.out.println("Please enter integer number  ");
//        }


        //Q6 Write a Java program to reverse a word
//        try {
//            System.out.println("Please Enter your sentence to reverse it : ");
//            String sentence = sc.nextLine();
//            String reverse = reverseSentence(sentence);
//            System.out.println("This is the sentence after reversing: " + reverse);
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        }

        //Q7 Java program to check whether the given number is even or odd

//        try {
//            System.out.println("Please enter number of Integer : ");
//            int n = sc.nextInt();
//
//            if (n%2==0){
//                System.out.println("The number is Even");
//            }else{
//                System.out.println("The number is Odd");
//            }
//        }catch (InputMismatchException e){
//            System.out.println("Please enter integer number ");
//        }


        //Q8 - Java program to convert the temperature in Centigrade to Fahrenheit

//        try {
//            System.out.println("Enter temperature in Centigrade:");
//            double centigrade = sc.nextDouble();
//
//            double fahrenheit = (centigrade * 9/5) + 32 ;
//            System.out.println("Temperature in Fahrenheit is: " +fahrenheit );
//        }catch (InputMismatchException e){
//            System.out.println("please enter temperature  ");
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }


        //Q9 .Write a Java program that takes a string and a number from the user,then prints the
        //character in the given index

//        try {
//            System.out.println("Enter a sentence : ");
//            String s = sc.nextLine();
//
//            System.out.println("Enter Integer : ");
//            int index = sc.nextInt();
//            char c = getIndex(s, index);
//            System.out.println("Your character is: " + c);
//        }catch (StringIndexOutOfBoundsException e){
//            System.out.println(e.getMessage());
//        }

        //Q10) Write a Java program to print the area and perimeter of a rectangle.

//        try {
//            System.out.println("Please enter your Width : ");
//            double width = sc.nextDouble();
//            System.out.println("Please enter your Height :");
//            double height = sc.nextDouble();
//            printRectangle(width, height);
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        }


    }


    //Q2
    public static void printMultiplicationTable(int num) throws IllegalArgumentException  {
        if (num <= 0) {
            throw new IllegalArgumentException("Number must be greater than zero.");
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }

    //Q3
    public static void printCircleProperties(double radius) throws IllegalArgumentException {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be greater than zero.");
        }
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
    }

    //Q4
    public static double calculateAverage(Scanner sc, int n) throws InputMismatchException {
        if (n <= 0) {
            throw new InputMismatchException("Number of integers must be greater than zero.");
        }
        double sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter an integer: ");
            int num = sc.nextInt();
            sum += num;
        }
        return sum / n;
    }

    //Q6
    public static String reverseSentence(String sentence) throws IllegalArgumentException {
        if (sentence == null || sentence.isEmpty()) {
            throw new IllegalArgumentException("Sentence cannot be null or empty.");
        }
        String reversed = "";
        for (int i = sentence.length() - 1; i >= 0; i--) {
            reversed += sentence.charAt(i);
        }
        return reversed;
    }

    //Q9
    public static char getIndex(String s, int index) throws StringIndexOutOfBoundsException {
        if (index < 0 || index >= s.length()) {
            throw new StringIndexOutOfBoundsException("Index out of bounds.");
        }
        return s.charAt(index);
    }

    //Q10
    public static void printRectangle(double width, double height) throws IllegalArgumentException {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Width and height must be greater than zero.");
        }
        double area = width * height;
        double perimeter = 2 * (width + height);
        System.out.println("Area is: " + width + " * " + height + " = " + area);
        System.out.println("Perimeter is 2 * (" + width + " + " + height + ")" + " = " + perimeter);
    }
}