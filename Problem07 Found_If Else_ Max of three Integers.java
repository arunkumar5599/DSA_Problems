/*
07. Found_If Else_ Max of three Integers
Take three numbers a,b and c as input. Print the max out of 3 Integers.
Input Format

The first line contains integer a.
The second line contains integer b.
The third line contains integer c.
Constraints

1<= a,b and c <=10000
Output Format

Output according to problem statement.
Sample Input 0

6
3
4
Sample Output 0

6
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
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b && a>c){
            System.out.println(a);
        }
        else if(b>a && b>c){
            System.out.println(b);
        }else{
            System.out.println(c);
        }
    }
}