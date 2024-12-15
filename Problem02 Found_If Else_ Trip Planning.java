/*
02.Found_If Else_ Trip Planning
Take a number n as input representing Budget of trip. Print "goa" if the budget is greater than equal to 10000 else Print "murthal".
Input Format

The only line contains an integer n
Constraints

1<= n <=100000
Output Format

Output according to problem statement.
Sample Input 0

5000
Sample Output 0

murthal


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
        int budget=sc.nextInt();
        if(budget>=10000){
            System.out.println("goa");
        }else{
            System.out.println("murthal");
        }
    }
}