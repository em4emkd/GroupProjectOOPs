package com.syntax.groupproject;

public class Task1 {
    /*
    Create an Interface 'Shape' with undefined methods
    as calculateArea and calculatePerimiter. Create 2
    classes Circle & Square that implements functionality
    defined in the Shape Interface. Test your code.
     */
    public interface Shape {

        double CalculateArea();
        double CalculatePerimeter();
    }

    class Square implements Shape {

        private double length;
        private double width;

        public Square(double length, double width) {
            this.length = length;
            this.width = width;
        }

        @Override
        public double CalculateArea() {

            return length * width;
        }

        @Override
        public double CalculatePerimeter() {

            return 2 * (length + width);
        }
    }

    class Circle implements Shape {

        private double radius;

        public Circle(double radius) {
            this.radius = radius;

        }

        @Override
        public double CalculateArea() {

            return Math.PI * radius * radius;
        }

        @Override
        public double CalculatePerimeter() {

            return 2 * Math.PI * radius;
        }
    }
}
