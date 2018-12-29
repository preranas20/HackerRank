// Java Sub array problem
/*
We define the following:

A subarray of an -element array is an array composed from a contiguous block of the original array's elements. For example, if , then the subarrays are , , , , , and . Something like  would not be a subarray as it's not a contiguous subsection of the original array.
The sum of an array is the total sum of its elements.
An array's sum is negative if the total sum of its elements is negative.
An array's sum is positive if the total sum of its elements is positive.
Given an array of  integers, find and print its number of negative subarrays on a new line.

Input Format

The first line contains a single integer, , denoting the length of array . 
The second line contains  space-separated integers describing each respective element, , in array .

Constraints

Output Format

Print the number of subarrays of  having negative sums.

Sample Input

5
1 -2 4 -5 1
Sample Output

9
Explanation

There are nine negative subarrays of :

Thus, we print  on a new line.

*/




import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {


    static int factorial(int n) 
    { 
        if (n == 0) 
          return 1; 
          
        return n*factorial(n-1); 
    } 

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = factorial(n);
        int[] arr = new int[n];
        int[] sums = new int[m];
        while(scan.hasNextInt()){
           for(int i=0;i<arr.length;i++){
               arr[i]=scan.nextInt();
           }
        }
        int index = 0;
         int count = 0;
        for(int i=0;i<arr.length;i++){
            int total = 0;
            for(int j=i;j<arr.length;j++){
                total=arr[j]+total;
                 if(total<0)
                   count++;
                //sums[index] = total;
                //index++;
            }
        }
      
      /*  for(int i =0;i<sums.length;i++){
            if(sums[i]<0)
                 count++;
        }*/

        System.out.println(count);
    }
}

