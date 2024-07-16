package section12.Practice;

// 인터페이스
interface Shape2 { // 같은 패키지 내에서는 인터페이스 및 클래스 명은 하나씩만 존재해야함.
    double calculateArea();

    String getName();
}

class Circle2 implements Shape2 {
    double radius;
    String name;

    Circle2(double radius, String name) {
        this.name = name;
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public String getName() {
        return this.name;
    }
}

class Rectangle2 implements Shape2 {
    double width;
    double height;
    String name;

    Rectangle2(double width, double height, String name) {
        this.name = name;
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return this.width * this.height;
    }

    @Override
    public String getName() {
        return this.name;
    }
}

class Triangle2 implements Shape2 {
    double width;
    double height;
    String name;

    Triangle2(double width, double height, String name) {
        this.name = name;
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return this.width * this.height * 0.5;
    }

    @Override
    public String getName() {
        return this.name;
    }
}

public class Practice4 {
    public static void main(String[] args) {
        Shape2[] shape2s = {
            new Circle2(5.0, "원"),
            new Rectangle2(4.0, 6.0, "직사각형"),
            new Triangle2(4.0, 5.0, "삼각형")
        };

        for (Shape2 shape2 : shape2s) {
            System.out.printf("%s의 면적: %.2f\n", shape2.getName(), shape2.calculateArea());
        }
    }
}
