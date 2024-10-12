
import java.io.*;
import java.util.*;
class Solution {
    public int pairWithMaxSum(int[] arr) {
        // code here
        int maxSum=-1;
       for(int i=0;i<arr.length-1;i++)
       {
           int sum=arr[i]+arr[i+1];
           if(sum>maxSum) maxSum=sum;
       }
       return maxSum;
    }
}
