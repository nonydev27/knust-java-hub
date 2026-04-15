// Declare the package for this Java file to organize the code
package OOP.CircleClass;

// Blank line

// Define a class named Circle to represent a circle with encapsulation
class Circle {
    // Declare a private double field for the radius to ensure data encapsulation
    private double radius;
    // Declare a private final double constant for the value of PI
    private final double PI = 3.14159;

    // Blank line

    // Define a public constructor for Circle that takes a double parameter for radius
    public Circle(double r) {
        // Assign the parameter r to the private radius field
        radius = r;
    }

    // Blank line

    // Define a public default constructor for Circle that sets radius to 0.0
    public Circle() {
        // Set the radius to 0.0 as default
        radius = 0.0;
    }

    // Blank line

    // Define a public setter method named setRadius that takes a double parameter to update radius
    public void setRadius(double r) {
        // Assign the parameter r to the private radius field
        radius = r;
    }

    // Blank line

    // Define a public getter method named getRadius that returns the radius as double
    public double getRadius() {
        // Return the value of the private radius field
        return radius;
    }

    // Blank line

    // Define a public method named getArea that calculates and returns the area of the circle as double
    public double getArea() {
        // Calculate area using PI * radius * radius and return it
        return PI * radius * radius;
    }

    // Blank line

    // Define a public method named getDiameter that calculates and returns the diameter as double
    public double getDiameter() {
        // Calculate diameter as radius * 2 and return it
        return radius * 2;
    }

    // Blank line

    // Define a public method named getCircumference that calculates and returns the circumference as double
    public double getCircumference() {
        // Calculate circumference as 2 * PI * radius and return it
        return 2 * PI * radius;
    }
}