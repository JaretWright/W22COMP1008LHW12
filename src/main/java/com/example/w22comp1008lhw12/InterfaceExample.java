package com.example.w22comp1008lhw12;

import java.util.ArrayList;

public class InterfaceExample {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle("wall 1", 10,10);
        Rectangle rectangle2 = new Rectangle("wall 2",50,10);
        Rectangle rectangle3 = new Rectangle("wall 3", 4,12);

        ArrayList<Rectangle> areasToCalculate = new ArrayList<>();
        areasToCalculate.add(rectangle1);
        areasToCalculate.add(rectangle2);
        areasToCalculate.add(rectangle3);

        double area = 0;

        for (Rectangle rectangle : areasToCalculate)
        {
            System.out.printf("%-6s area=%6.1f%n",rectangle.getWallName(), rectangle.getArea());
            area += rectangle.getArea();
        }

        System.out.printf("The total area is: %.1f%n",area);
    }
}
