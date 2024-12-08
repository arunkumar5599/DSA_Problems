/*
Problem09 Found_Loops_IsPrime
Take as input a number n. Determine whether it is prime or not. If it is prime, 
print "Prime" otherwise print "Not Prime".
Input Format

Integer

Constraints

n <= 10 ^ 9

Output Format

String

Sample Input 0

7
Sample Output 0

Prime
Sample Input 1

9
Sample Output 1

Not Prime
*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception { 
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
}
}