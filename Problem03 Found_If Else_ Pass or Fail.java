/*
03.Found_If Else_ Pass or Fail
Take a number n as input representing marks of a student. Print "pass" if the mark is greater than equal to 35 else Print "fail".
Input Format

The only line contains an integer n
Constraints

1<= n <=100
Output Format

Output according to problem statement.
Sample Input 0

40
Sample Output 0

pass

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
        int marks=sc.nextInt();
        if(marks>=35){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }
    }
}