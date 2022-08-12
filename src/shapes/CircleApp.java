package shapes;

import util.Input;   // <---- importing my  Input class

import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {

        Input userInput = new Input(); /// making new object/constructor  <--- from my input class to use it for the circle app
        System.out.println("Pick a radius: "  ); // prompting  user
        Circle myCircle = new Circle(userInput.getDouble()); //making the new object with input method // the method returns the userinput so
        // thats how we captures the users input


        System.out.printf("the radius you have chosen: %s this the area: %s  this is the circumference: %s  %n", myCircle.getRadius(),myCircle.getArea(), myCircle.getCircumference());






    }
}
