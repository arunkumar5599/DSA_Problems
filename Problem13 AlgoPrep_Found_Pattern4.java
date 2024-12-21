/*
Problem13. AlgoPrep_Found_Pattern4
Take as input a number n, the number of rows  
Print the following pattern  
*** ***  
**   **  
*     *  
**   **  
*** ***  
for n = 5.  
Input Format

Integer

Constraints

n <= 10 ^ 9 and is odd

Output Format

Pattern for n = 5.
*** ***  
**   **  
*     *  
**   **  
*** ***  
Sample Input 0

5
Sample Output 0

*** ***
**   **
*     *
**   **
*** ***
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
        int gst=1; 
        int nst=n/2+1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nst;j++){
                System.out.print("*");
            }
            for(int j=1;j<=gst;j++){ 
                System.out.print(" ");
            }
            for(int j=1;j<=nst;j++){
                System.out.print("*");
            }
            if(i<=n/2){
                nst=nst-1;
                gst=gst+2;
            }else{
                nst=nst+1;
                gst=gst-2;
            }
            System.out.println();
        }
    }
}