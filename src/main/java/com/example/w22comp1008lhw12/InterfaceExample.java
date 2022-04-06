package com.example.w22comp1008lhw12;

import java.util.ArrayList;

public class InterfaceExample {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle("wall 1", 10,10);
        Rectangle rectangle2 = new Rectangle("wall 2",50,10);
        Rectangle rectangle3 = new Rectangle("wall 3", 4,12);
        Circle circle1 = new Circle("circle ceiling 1", 30);
        Circle circle2 = new Circle("circle ceiling 2", 10.5);
        Circle circle3 = new Circle("circle ceiling 3", 17);

        ArrayList<TwoDimensionalShape> areasToCalculate = new ArrayList<>();
        areasToCalculate.add(rectangle1);
        areasToCalculate.add(rectangle2);
        areasToCalculate.add(rectangle3);
        areasToCalculate.add(circle1);
        areasToCalculate.add(circle2);
        areasToCalculate.add(circle3);

        double area = 0;

        for (TwoDimensionalShape twoDShape : areasToCalculate)
        {
            System.out.printf("%-6s area=%6.1f%n",twoDShape.getWallName(), twoDShape.getArea());
            area += twoDShape.getArea();
        }

        System.out.printf("The total area is: %.1f%n",area);
    }
}
