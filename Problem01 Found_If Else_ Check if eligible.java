/*
01.Found_If Else_ Check if eligible
Take a number n as input representing age of a person. Print "eligible" if the person is Eligible for driving license else Print "not eligible".
Input Format

The only line contains an integer n
Constraints

1<= n <=100
Output Format

Output according to problem statement.
Sample Input 0

15
Sample Output 0

not eligible

*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age>=18)
            System.out.println("eligible");
        else
            System.out.println("not eligible");
    }
}