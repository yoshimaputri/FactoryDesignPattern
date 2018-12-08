package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactoryPatternDemo {
    public static void main(String[] args) throws IOException {
        InputStreamReader key = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(key);
        ShapeFactory shapeFactory = new ShapeFactory();

        String shapePoint, loop = "y";
        while(loop.equals("y") || loop.equals("Y")) {
            System.out.print("Enter total point of the shape / the name of shape : ");
            shapePoint = input.readLine();
            shapePoint.toUpperCase();
            if (shapePoint.equalsIgnoreCase("~") || shapePoint.equalsIgnoreCase("CIRCLE")) {
                Shape shape1 = shapeFactory.getShape("CIRCLE");
                shape1.draw();
            } else if (shapePoint.equalsIgnoreCase("2") || shapePoint.equalsIgnoreCase("LINE")) {
                Shape shape2 = shapeFactory.getShape("LINE");
                shape2.draw();
            } else if (shapePoint.equalsIgnoreCase("3") ||shapePoint.equalsIgnoreCase("TRIANGLE")) {
                Shape shape3 = shapeFactory.getShape("TRIANGLE");
                shape3.draw();
            } else if (shapePoint.equalsIgnoreCase("4") || shapePoint.equalsIgnoreCase("RECTANGLE")) {
                Shape shape2 = shapeFactory.getShape("RECTANGLE");
                shape2.draw();
            } else if (shapePoint.equalsIgnoreCase("5") || shapePoint.equalsIgnoreCase("PENTAGON")) {
                Shape shape2 = shapeFactory.getShape("PENTAGON");
                shape2.draw();
            } else if (shapePoint.equalsIgnoreCase("6") || shapePoint.equalsIgnoreCase("HEXAGON")) {
                Shape shape2 = shapeFactory.getShape("HEXAGON");
                shape2.draw();
            } else {
                System.out.println("Your input is not defined !");
            }
            System.out.print("Continue (y/n) ? ");
            loop = input.readLine();
            System.out.println();
        }
    }
}
