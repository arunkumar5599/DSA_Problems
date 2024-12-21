/*
Problem11. AlgoPrep_Found_Pattern2
Take as input a number n, the number of rows
Print the following pattern
1
2	3
4	5	6
7	8	9	10
for n = 4.
Input Format

Integer

Constraints

n <= 10 ^ 9

Output Format

Pattern for n = 4.
1
2 3
4 5 6
7 8 9 10

Sample Input 0

4
Sample Output 0

1
2    3
4    5    6
7    8    9    10

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
        int n=sc.nextInt();
        int nst=1;
        int count=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nst;j++){
                System.out.print(count+" ");
                count++;
            }
            nst=nst+1;
            System.out.println();
        }
    }
}