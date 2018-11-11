package guankevin.chapter01;

/**
 * Introduction to Java Programming and Data Structures 11th Edition by Daniel Liang.
 * Chapter 01 Introduction to Computers, Programs and Java
 * Programming Exercise 12 - Average Speed in Kilometers
 *
 * @author guankevin
 * @version 1.0
 * @since 2018-11-10
 */
public class ProgrammingExercise12 {
    public static void main(String[] args) {
        /*
            Assume that a runner runs 24 miles in 1 hour, 40 minutes, and 35 seconds.
            Write a program that displays the average speed in kilometers per hour.
            (Note 1 mile is equal to 1.6 kilometers)
         */

        System.out.println("Miles to kilometers is " + (24 * 1.6) + ".");
        System.out.println("Number of hours in fraction is " +
                (((60 * 60) + (40 * 60) + 35)) / (60.0 * 60));

        System.out.println("The runner ran " + (38.400000000000006 / 1.676388888888889) + " kilometers per hour");
    }
}
