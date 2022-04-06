package com.example.w22comp1008lhw12;

public class Rectangle {
    private double height, width;
    private String wallName;

    public Rectangle(String wallName, double height, double width) {
        setHeight(height);
        setWidth(width);
        setWallName(wallName);
    }

    public String getWallName() {
        return wallName;
    }

    public void setWallName(String wallName) {
        if (wallName.length()>= 1)
            this.wallName = wallName;
        else
            throw new IllegalArgumentException("Wall name must be at least 1 character");
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0)
            this.height = height;
        else
            throw new IllegalArgumentException("Height must be greater than 0");
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0)
            this.width = width;
        else
            throw new IllegalArgumentException("Width must be greater than 0");
    }

    public double getArea()
    {
        return width * height;
    }
}
