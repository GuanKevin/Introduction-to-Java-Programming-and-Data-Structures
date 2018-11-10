package guankevin.chapter01;

/**
 * Introduction to Java Programming and Data Structures 11th Edition by Daniel Liang.
 * Chapter 01 Introduction to Computers, Programs and Java
 * Programming Exercise 07 - Approximate Pi
 *
 * @author guankevin
 * @version 1.0
 * @since
 */
public class ProgrammingExercise07 {
    public static void main(String[] args) {
        /*
            Write a program that displays the result of
            4 × (1 − 13 + 15 − 17 + 19 − 111) and
            4 × (1 − 13 + 15 − 17 + 19 − 111 + 113).
         */

        System.out.println(4 * (1.0 - 13 + 15 - 17 + 19 - 111));

        System.out.println(4 * (1.0 - 13 + 15 - 17 + 19 - 111 + 113));
    }
}
