//Currency Formatter Problem

/*
Given a double-precision number, payment, denoting an amount of money, use the NumberFormat class' getCurrencyInstance method to convert  payment into the US, Indian, Chinese, and French currency formats. Then print the formatted values as follows:

US: formattedPayment
India: formattedPayment
China: formattedPayment
France: formattedPayment
where  formattedPayment is payment formatted according to the appropriate Locale's currency.

Note: India does not have a built-in Locale, so you must construct one where the language is en (i.e., English).

Input Format:

A single double-precision number denoting payment.

Constraints:
0<=payment<=10^9

Output Format:

On the first line, print US: u where u is payment formatted for US currency. 
On the second line, print India: i where i is  payment formatted for Indian currency. 
On the third line, print China: c where c is payment  formatted for Chinese currency. 
On the fourth line, print France: f, where f is payment formatted for French currency.

Sample Input:
12324.134

Sample Output:

US: $12,324.13
India: Rs.12,324.13
China: ￥12,324.13
France: 12 324,13 €

Explanation:

Each line contains the value of payment formatted according to the four countries' respective currencies.

*/


import java.util.*;
import java.text.*;

public class Solution {
    public static String us,china,france,india;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(Locale.US);
        us = currencyFormatter.format(payment);
        NumberFormat currencyFormatter1 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        china = currencyFormatter1.format(payment);  
        NumberFormat currencyFormatter2 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        france = currencyFormatter2.format(payment);    
        NumberFormat currencyFormatter3 = NumberFormat.getCurrencyInstance(Locale.US);
        us = currencyFormatter3.format(payment);
        Locale locale = new Locale("en","IN");
        NumberFormat currencyFormatter4 = NumberFormat.getCurrencyInstance(locale);
        india = currencyFormatter4.format(payment);   
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}

