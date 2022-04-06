package com.example.w22comp1008lhw12;

public class Circle implements TwoDimensionalShape{
    private double radius;
    private String wallName;

    public Circle(String wallName, double radius) {
        setRadius(radius);
        setWallName(wallName);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0)
            this.radius = radius;
        else
            throw new IllegalArgumentException("radius must be greater than 0");
    }

    public double getArea()
    {
        return Math.PI*radius*radius;
    }

    public String getWallName() {
        return wallName;
    }

    public void setWallName(String wallName) {
        if (wallName.length()>0)
            this.wallName = wallName;
        else
            throw new IllegalArgumentException("Wall name must be at least 1 character");
    }
}
