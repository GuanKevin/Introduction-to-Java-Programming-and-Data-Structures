package guankevin.chapter01;

/**
 * Introduction to Java Programming and Data Structures 11th Edition by Daniel Liang.
 * Chapter 01 Introduction to Computers, Programs and Java
 * Programming Exercise 08
 *
 * @author guankevin
 * @version 1.0
 * @since
 */
public class ProgrammingExercise08 {
    public static void main(String[] args) {
        /*
            Write a program that displays the area and perimeter of a
            circle that has a radius of 5.5 using the following formulas:

            Perimeter = 2 x radius x pi
            Area = radius x radius x pi

            radius = 5.5
            pi = 3.14159
         */

        System.out.println("Perimeter = 2 x radius x pi" +
                "\nPerimeter = 2 x 5.5 x 3.14159" +
                "\nPerimeter = " + (2 * 5.5 * 3.14159));

        System.out.println("Area = radius x radius x pi" +
                "\nArea = 5.5 x 5.5 x 3.14159" +
                "\nArea = " + (5.5 * 5.5 * 3.14159));

    }
}
