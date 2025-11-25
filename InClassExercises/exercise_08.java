/*
 * @Author: ehcgnahc 
 * @Date: 2025-11-25 22:53:40 
 * @Last Modified by: ehcgnahc
 * @Last Modified time: 2025-11-25 23:02:37
 * 
 * 課堂練習：Shape2D計算周長
 * 
 * 定義Shape2D的計算周長方法
 * 並讓兩個繼承的class 改寫(override)各自計算周長的方法
 */

public class exercise_08 {
    public static class Shape2D {
        public double area() {
            return 0;
        }

        public double perimeter() {
            return 0;
        }
    }

    public static class Rectangle extends Shape2D {
        private double length, width;
        public Rectangle(double l, double w) {
            length = l;
            width = w;
        }
        public double area() {
            return length * width;
        }

        public double perimeter() {
            return 2 * (length + width);
        }
    }

    public static class Circle extends Shape2D {
        private double radius;
        public Circle(double r) {
            radius = r;
        }
        public double area() { // Override
            return 3.141592654 * radius * radius;
        }
        public double perimeter() {
            return 2 * 3.141592654 * radius;
        }
    }
    public static void main(String[] args){
        Shape2D s1 = new Rectangle(5, 3);
        Shape2D s2 = new Circle(4);

        System.out.println("=== Rectangle ===");
        System.out.println("Area = " + s1.area());
        System.out.println("Perimeter = " + s1.perimeter());

        System.out.println("\n=== Circle ===");
        System.out.println("Area = " + s2.area());
        System.out.println("Perimeter = " + s2.perimeter());
    }
}