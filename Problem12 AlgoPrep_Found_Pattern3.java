/*
Problem12. AlgoPrep_Found_Pattern3
Take as input a number n, the number of rows
Print the following pattern
  *
 ***
*****
 ***
  *
for n = 5.
Input Format

Integer

Constraints

n <= 10 ^ 9 and is an odd number

Output Format

Pattern for n = 5.
  *  
 ***  
*****  
 ***  
  *  
Sample Input 0

5
Sample Output 0

  *
 ***
*****
 ***
  *
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
        int gst=n/2;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=gst;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=nst;j++){ 
                System.out.print("*");
            }
            if(i<=n/2){
                nst=nst+2;
                gst=gst-1;
            }else{
                nst=nst-2;
                gst=gst+1;
            }
            System.out.println();
        }
    }
}