/*
05 Found_If Else_ Divisible by two or three
Take a number n as input. Print "divisible" if the number is divisible by 2 or 3 else Print "not divisible".
Input Format

The only line contains an integer n
Constraints

1<= n <=10000
Output Format

Output according to problem statement.
Sample Input 0

9
Sample Output 0

divisible
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
        int number=sc.nextInt();
        if(number%2==0 || number%3==0){
            System.out.println("divisible");
        }else{
            System.out.println("not divisible");
        }
    }
}