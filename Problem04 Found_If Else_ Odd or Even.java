/*
04. Found_If Else_ Odd or Even
Take a number n as input. Print "even" if the number is even else Print "odd".
Input Format

The only line contains an integer n
Constraints

1<= n <=10000
Output Format

Output according to problem statement.
Sample Input 0

50
Sample Output 0

even
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
        if(number%2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
}