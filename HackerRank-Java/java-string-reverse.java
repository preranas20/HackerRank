//Java String Reverse Problem(Palindrome)

/*
A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.(Wikipedia)
Given a string A, print Yes if it is a palindrome, print No otherwise.

Constraints:

A will consist at most 50 lower case english letters.

Sample Input:

madam

Sample Output:

Yes

*/



import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        boolean flag = false;
        /* Enter your code here. Print output to STDOUT. */
        if (A.length()<2)
           flag = true;
        else{
        for(int i=0,j=A.length()-1;i<((int)Math.round(A.length()/2));i++,j--){
            if(A.charAt(i)== A.charAt(j)){
                flag = true;
                continue;
            }
            else{
                flag = false;
                break;
            }
        }
        }
        
        if(flag == true){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
            
        
    }
}



