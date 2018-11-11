package guankevin.chapter01;

/**
 * Introduction to Java Programming and Data Structures 11th Edition by Daniel Liang.
 * Chapter 01 Introduction to Computers, Programs and Java
 * Programming Exercise 09 - Area and Perimeter of a Rectangle
 *
 * @author guankevin
 * @version 1.0
 * @since 2018-11-10
 */
public class ProgrammingExercise09 {
    public static void main(String[] args) {
        /*
            Write a program that displays the area and
            perimeter of a rectangle with a width of 4.5
            and a height of 7.9 using the following formula

            Area = width x height
            Perimeter = 2 x (width + height)

            width = 4.5
            height = 7.9
         */

        System.out.println("Area of a Rectangle = Width x Height\n" +
                "Area = " + (4.5 * 7.9));

        System.out.println("Perimeter of a Rectangle = 2(Width + Height)\n" +
                "Area = " + (2 * (4.5 + 7.9)));
    }
}
