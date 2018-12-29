//Java ArrayList Problem
/*
Sometimes it's better to use dynamic size arrays. Java's Arraylist can provide you this feature. Try to solve this problem using Arraylist.

You are given n lines. In each line there are zero or more integers. You need to answer a few queries where you need to tell the number located in yth position of xth line. 

Take your input from System.in.

Input Format
The first line has an integer n. In each of the next n lines there will be an integer d denoting number of integers on that line and then there will be d space-separated integers. In the next line there will be an integer q denoting number of queries. Each query will consist of two integers x and y.

Constraints:
- 1<=n<=20000
- 0<=d<=50000
- 1<=q<=1000
- 1<=x<=n

Each number will fit in signed integer.
Total number of integers in n lines will not cross 10^5.

Output Format:
In each line, output the number located in yth  position of xth line. If there is no such position, just print "ERROR!"

Sample Input:

5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5

Sample Output:

74
52
37
ERROR!
ERROR!
Explanation

The diagram below explains the queries:

image


*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<ArrayList<Integer>> lines = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<n;i++){
             //Scanner scanner = new Scanner(System.in);
             int d = scan.nextInt();
             ArrayList<Integer> numbers = new ArrayList<Integer>();
             for(int j=0;j<d;j++){
                // Scanner scan1 = new Scanner(System.in);
                 int num = scan.nextInt();
                 numbers.add(num);
             }
             lines.add(numbers);
        }

        //for querying
        
        //Scanner scanQueryNum = new Scanner(System.in);
        int q = scan.nextInt();
        for(int k=0;k<q;k++){
            int result = -1;
            //Scanner scanNum = new Scanner(System.in);
            int x = scan.nextInt();
            int y = scan.nextInt();
            if(x-1 < lines.size()){
                ArrayList<Integer> elements = lines.get(x-1);
                if(y-1 < elements.size()){
                    result = elements.get(y-1);
                }
                
            }
            if(result>0)
               System.out.println(result);
            else
               System.out.println("ERROR!");
              
        }

        
    }
}

