package guankevin.chapter01;

/**
 * Introduction to Java Programming and Data Structures 11th Edition by Daniel Liang.
 * Chapter 01 Introduction to Computers, Programs and Java
 * Programming Exercise 13
 *
 * @author guankevin
 * @version 1.0
 * @since 2018-11-10
 */
public class ProgrammingExercise13 {
    public static void main(String[] args) {
        /*
            Write a program that solves the following equation and
            displays the value for x and y:
                3.4x + 50.2y = 44.5
                2.1x + .55y = 5.9
            You can use Cramer’s rule to solve the following 2 x 2
            system of linear equation provided that ad - bc is not 0.
         */

        // Find the determinant, D, by using the x and y values from the problem.
        System.out.println("D: " + ((3.4 * 0.55) + (2.1 * 50.2)));

        // Find the determinant, Dx, by replacing the x-values in the first column with the values after the equal sign leaving the y column unchanged.
        System.out.println("Dx: " + ((44.5 * 0.55) + (5.9 * 50.2)));

        // Find the determinant, Dy, by replacing the y-values in the second column with the values after the equal sign leaving the x column unchanged.
        System.out.println("Dy: " + ((3.4 * 5.90) + (2.1 * 44.5)));

        // Use Cramer’s Rule to find the values of x and y
        System.out.println("(x, y) = " + "(" + (320.655 / 107.29) + ", " + (113.510 / 107.29) + ")");
    }
}
