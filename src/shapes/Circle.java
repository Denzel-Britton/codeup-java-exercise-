package shapes;

import static java.lang.Math.PI;

public class Circle {

    ///fields
    private double radius; // private


    // constructor
    public Circle(double radius) {  // constructor
        this.radius = radius;
    }
        ///getter
    public double getRadius(){  // <--- good practice to name "get" to your getter
        return this.radius; //// getter this makes it where any class can grab it and use the private radius
    }
        //setter
    public void setRadius(double radius){ // <--- good practice to name "set" to your setter
        this.radius = radius; //// setter  this makes it where any class can and set the radius using this setRaduis
    }

    // methods
    public double getArea(){
        return 2 * PI * Math.pow(radius, 2); // raises it by the power of two
    }
    public double getCircumference(){
        return  2 * PI * radius; /// method to get the circumference
    }

}
