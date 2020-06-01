
import java.io.*;
import java.util.*;
import java.lang.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        StringBuilder input1 = new StringBuilder();

        input1.append(A);

        input1 = input1.reverse();

        if (A.equals(input1.toString())) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}
