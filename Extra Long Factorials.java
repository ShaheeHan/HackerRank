import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

     static BigInteger[] a = new BigInteger[101];
    // Complete the extraLongFactorials function below.
    static void f()
    {
        a[0] = BigInteger.ONE;
        a[1]  = BigInteger.ONE;
        for(int i=2;i<=100;i++)
        {
            a[i] = a[i-1].multiply(BigInteger.valueOf(i));
            
        }
    }
    
    static void extraLongFactorials(int n) {
        
       System.out.println(a[n]);
        

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        f();
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        extraLongFactorials(n);

        scanner.close();
    }
}
