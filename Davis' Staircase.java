import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int dp[]  = new int[38]; 
    
    // Complete the stepPerms function below.
    static int stepPerms(int n) {
        int cnt = 0;
        
        if(n==0)
            return 1;
        if(n<0)
            return 0;
       // else if((n-1) >= 0 && (n-2) >= 0 && (n-3) >= 0)
        if(dp[n]!=-1)
            return dp[n];
        else
        {
            int c=0;
            c += (stepPerms(n-1)) ;
            c += (stepPerms(n-2));
            c += (stepPerms(n-3));
            dp[n] = c;
            return c;
            
        }
        // else if((n-1) >= 0 && (n-2) >= 0)
           // return (1+stepPerms(n-1)) +  (1+stepPerms(n-2)) ;
        //else  if((n-1)>=0)
             //return (1+stepPerms(n-1));
       //return 0; 
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        
        for(int i=0;i<38;i++) dp[i]  = -1;
        int s = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        

        for (int sItr = 0; sItr < s; sItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int res = stepPerms(n);

            bufferedWriter.write(String.valueOf(res));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
