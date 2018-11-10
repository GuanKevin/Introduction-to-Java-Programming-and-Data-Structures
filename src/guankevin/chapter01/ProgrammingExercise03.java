package guankevin.chapter01;

/**
 * Introduction to Java Programming and Data Structures 11th Edition by Daniel Liang.
 * Chapter 01 Introduction to Computers, Programs and Java
 * Programming Exercise 03 - Display a Pattern
 *
 * @author guankevin
 * @version 1.0
 * @since 2018-11-10
 */
public class ProgrammingExercise03 {
    public static void main(String[] args) {
        /*
            Write a Program that displays JAVA as a pattern with character
                        J        A            V       V        A
                        J      A   A           V     V       A   A
                J       J     A  A  A           V   V       A  A  A
                J  J  J J    A       A           V V       A       A
         */

        System.out.print("         J        A            V       V       A\n");
        System.out.print("         J      A   A           V     V       A A\n");
        System.out.print(" J       J     A  A  A           V   V       A A A\n");
        System.out.print(" J  J  J J    A       A           V V       A     A");
    }
}
