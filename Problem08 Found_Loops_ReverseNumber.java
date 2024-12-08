/*
Problem08 Found_Loops_ReverseNumber:
------------------------------------
Take as input n. Print the number in reverse.
Input Format

Integer

Constraints

n <= 10 ^ 9

Output Format

Integer

Sample Input 0

92345
Sample Output 0

54329
*/



import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int res=0;
        while(num>0){
            int rem=num%10;
            res=res*10+rem;
            num=num/10;
        }
        System.out.println(res);
    }
}