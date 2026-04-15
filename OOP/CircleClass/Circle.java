package OOP.CircleClass;

// Circle class demonstrates encapsulation with private fields and public methods
class Circle {
    // Private field for radius to ensure encapsulation
    private double radius;
    // Constant for PI value
    private final double PI = 3.14159;

    // Constructor with radius parameter to initialize the circle
    public Circle(double r) {
        radius = r;
    }

    // Default constructor setting radius to 0.0
    public Circle() {
        radius = 0.0;
    }

    // Setter method to change the radius
    public void setRadius(double r) {
        radius = r;
    }

    // Getter method to retrieve the radius
    public double getRadius() {
        return radius;
    }

    // Method to calculate and return the area of the circle
    public double getArea() {
        return PI * radius * radius;
    }

    // Method to calculate and return the diameter
    public double getDiameter() {
        return radius * 2;
    }

    // Method to calculate and return the circumference
    public double getCircumference() {
        return 2 * PI * radius;
    }
}