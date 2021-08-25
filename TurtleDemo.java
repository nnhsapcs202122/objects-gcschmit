/**
 * Every Java program contains one or more classes (e.g., TurtleDemo).
 * 
 * In general, every source file (e.g., TurtleDemo.java) contains
 *      one class (e.g., TurtleDemo).
 *      
 * The source file name must match the class name.
 * 
 * By convention, class names start with an uppercase letter.
 * 
 * @author gcschmit
 * @version 25 August 2021
 */

import java.awt.Color;

public class TurtleDemo
{
    /*
     * A class contains methods.
     * 
     * Most Java programs contain a class with a main method.
     * 
     * The main method is executed when the program starts.
     */
    public static void main(String[] args)
    {
        World ocean = new World();
        Turtle crush = new Turtle(ocean);
        crush.setPenColor(Color.ORANGE);
        crush.penDown();
        
        /*
         * A method contains statements.
         * 
         * Statements may invoke other methods (e.g., forward).
         * 
         * In general, methods are invoked on objects (e.g., crush).
         * 
         * When invoking a method, arguments are passed in parentheses (e.g., 50).
         */
        crush.forward(50);  // comment at the end of a line
        
        // this is a single-line comment (like # python)
        
        /*
         * Identifiers are any combination of:
         *      letters
         *      digits (but not as the first character)
         *      underscores (_)
         *      dollar signs ($)
         *      
         *  These are various identifiers:
         */
        int y, x2, x_y, x$;
        
        // this is not a valid identifier:
        //int 2y;
    }
}




