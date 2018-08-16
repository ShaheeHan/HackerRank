import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        List<Integer>l = new ArrayList();
        
        int mx = -1;
        int cnt=0;
        while(n>0)
        {
            if((n&1)==1)
                cnt++;
            else 
                cnt=0;
            mx = Math.max(mx,cnt);
            n>>=1;
        }
        System.out.println(mx);
        
        
        scanner.close();
    }
}
