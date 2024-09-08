//Given two integers a and b, write a function lcmAndGcd() to compute their LCM and GCD. The function takes two integers a and b as input and returns a list containing their LCM and GCD
//https://www.geeksforgeeks.org/problems/lcm-and-gcd4516/1

//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            Long A = Long.parseLong(S[0]);
            Long B = Long.parseLong(S[1]);

            Solution ob = new Solution();
            Long[] ptr = ob.lcmAndGcd(A,B);
            
            System.out.print(ptr[0]);
            System.out.print(" ");
            System.out.println(ptr[1]);
        }
    }
}
// } Driver Code Ends


class Solution {
    static Long[] lcmAndGcd(Long A , Long B) {
        // code here
        Long res[]=new Long[2];
        Long dup_A=A,dup_B=B;
        while(A!=0&&B!=0)
        {
            if(A>B) 
                A=A%B;
            else 
                B=B%A;
        }
        if(A==0) 
            res[1]=B;
        else
            res[1]=A;
        
        res[0]=(dup_A*dup_B)/res[1];
        // if(dup_A>dup_B)
        //     res[0]=(dup_A/res[1])*dup_B;
        // else
        //     res[0]=(dup_B/res[1])*dup_A;
        return res;
    }
}
