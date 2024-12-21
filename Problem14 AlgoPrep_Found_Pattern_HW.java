/*
Problem14 AlgoPrep_Found_Pattern_HW
Take as input a number n, the number of rows
Print the following pattern
    1
  2 3 2
3 4 5 4 3
  2 3 2
    1
for n = 5.
Input Format

Integer

Constraints

n <= 10 ^ 9 and is odd

Output Format

Pattern for n = 5.  
    1  
  2 3 2  
3 4 5 4 3  
  2 3 2  
    1  
Sample Input 0

5
Sample Output 0

    1
  2 3 2
3 4 5 4 3
  2 3 2
    1
	
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
        int val=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=gst;j++){
                System.out.print("  ");
            }
            if(i<=(n/2+1)){
                val=i;
            }else{
                val=n+1-i;
            }
            for(int j=1;j<=nst;j++){ 
                System.out.print(val+" ");
                if(j<=nst/2){
                    val=val+1;
                }else{
                    val=val-1;
                }
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