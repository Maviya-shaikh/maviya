//name:Vikas Gupta
//uin:231p056/10

abstract class Shape {
   
    abstract double area();
}

class Rectangle extends Shape {
    private double length;
    private double width;

  
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Override the area method for Rectangle
    @Override
    double area() {
        return length * width;
    }
}

class Square extends Shape {
    private double side;

   
    public Square(double side) {
        this.side = side;
    }

 
    @Override
    double area() {
        return side * side;
    }
}


public class Main {
    public static void main(String[] args) {
       
        Rectangle rectangle = new Rectangle(5, 3);
        System.out.println("Area of Rectangle: " + rectangle.area());

        
        Square square = new Square(4);
        System.out.println("Area of Square: " + square.area());
    }
}