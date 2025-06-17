package application;

import entities.CalculatorGeometry;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        CalculatorGeometry calculatorGeometry = new CalculatorGeometry();

        System.out.println("Enter the triangle data: Width,Height :");
        double triangleWidth = sc.nextDouble();
        double triangleHeight = sc.nextDouble();
        calculatorGeometry.calcAreaTriangle(triangleWidth,triangleHeight);

        System.out.println("Enter the Square data: Width,Height");
        double squareWidth = sc.nextDouble();
        double squareHeigh = sc.nextDouble();
        calculatorGeometry.calcAreaSquare(squareWidth,squareHeigh);

        System.out.println("Enter the Trapeze data:BaseMax,BaseMin, height");
        double trapezeBaseA = sc.nextDouble();
        double trapezeBaseB = sc.nextDouble();
        double trapezeHeight = sc.nextDouble();
        calculatorGeometry.calcAreaTrapeze(trapezeBaseA,trapezeBaseB,trapezeHeight);

        System.out.println("Enter the Circle data: Radius");
        double circleRadius = sc.nextDouble();
        calculatorGeometry.calcAreaCircle(circleRadius);

        System.out.println("Enter the Rectangle data: Width,Height");
        double rectangleWidth = sc.nextDouble();
        double rectangleHeight = sc.nextDouble();
        calculatorGeometry.calcAreaRectangle(rectangleWidth,rectangleHeight);

        System.out.printf("AREA TRIANGLE: %.2f%n",calculatorGeometry.calcAreaTriangle(triangleWidth,triangleHeight));
        System.out.printf("AREA SQUARE: %.2f%n",calculatorGeometry.calcAreaSquare(squareWidth,squareHeigh));
        System.out.printf("AREA TRAPEZE: %.2f%n",calculatorGeometry.calcAreaTrapeze(trapezeBaseA,trapezeBaseB,trapezeHeight));
        System.out.printf("AREA CIRCLE: %.2f%n",calculatorGeometry.calcAreaCircle(circleRadius));
        System.out.printf("AREA RECTANGLE: %.2f%n",calculatorGeometry.calcAreaRectangle(rectangleWidth,rectangleHeight));

       sc.close();
    }
}
