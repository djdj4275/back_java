package section12.Practice;

// 추상 클래스
abstract class Shape {
    String name;

    abstract double calculateArea();
}

class Circle extends Shape {
    double radius;

    Circle(double radius, String name) {
        this.name = name;
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }
}

class Rectangle extends Shape {
    double width;
    double height;

    Rectangle(double width, double height, String name) {
        this.name = name;
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return this.width * this.height;
    }
}

class Triangle extends Shape {
    double width;
    double height;

    Triangle(double width, double height, String name) {
        this.name = name;
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return this.width * this.height * 0.5;
    }
}

public class Practice3 {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(5.0, "원"),
            new Rectangle(4.0, 6.0, "직사각형"),
            new Triangle(4.0, 5.0, "삼각형")
        };

        for (Shape shape : shapes) {
            System.out.printf("%s의 면적: %.2f\n", shape.name, shape.calculateArea());
        }
    }
}
