
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try {
            Scanner sc = new Scanner(System.in);
            int x, y;
            x = sc.nextInt();
            y = sc.nextInt();
            int z = x / y;
            System.out.println(z);
        } catch (ArithmeticException E) {
            System.out.println(E);
        } catch (InputMismatchException E) {
            System.out.println("java.util.InputMismatchException");
        }

    }
}
