//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String,Integer>mymap = new HashMap<String,Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            Integer val = (Integer)(phone);
            mymap.put(name,val);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(!mymap.containsKey(s))
                System.out.println("Not found");
            else{
                 System.out.println(s+"="+mymap.get(s));
            
            }
        }
        in.close();
    }
}