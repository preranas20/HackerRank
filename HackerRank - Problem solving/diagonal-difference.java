//Diagonal difference
/*
Given a square matrix, calculate the absolute difference between the sums of its diagonals.

For example, the square matrix arr is shown below:

1 2 3
4 5 6
9 8 9  

The left-to-right diagonal 1+5+9 = 15. The right to left diagonal 3+5+9 = 17. Their absolute difference is |15-7| = 2 .

Function description:

Complete the  function diagonalDifference in the editor below. It must return an integer representing the absolute diagonal difference.

diagonalDifference takes the following parameter:

- arr: an array of integers .

Input Format:

The first line contains a single integer, n, the number of rows and columns in the matrix arr. 
Each of the next n lines describes a row, arr[i], and consists of n space-separated integers arr[i][j].

Constraints:
- -100<=arr[i][j]<=100

Output Format:

Print the absolute difference between the sums of the matrix's two diagonals as a single integer.

Sample Input:

3
11 2 4
4 5 6
10 8 -12

Sample Output:

15

Explanation:

The primary diagonal is:

11
   5
     -12
Sum across the primary diagonal: 11 + 5 - 12 = 4

The secondary diagonal is:

     4
   5
10
Sum across the secondary diagonal: 4 + 5 + 10 = 19 
Difference: |4 - 19| = 15

Note: |x| is the absolute value of x
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the diagonalDifference function below.
    static int diagonalDifference(int[][] arr) {
    int sumA =0;
    int sumB = 0;    
    

    for(int i = 0,j=arr.length-1;i<arr.length && j>-1;i++,j--){
               sumA += arr[i][i];           
               sumB += arr[i][j];
                
    }
    
    return Math.abs(sumA-sumB);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
