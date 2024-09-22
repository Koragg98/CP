//Maximum Sum
//https://practice.geeksforgeeks.org/contest/gfg-weekly-173-rated-contest/problems

class Solution {
    public static long maxSum(int n, int x, int[] arr) {
        // code here
        int num=1<<x-1;
        
        long maxGr1=-1l;
        long maxGr2=-1l;
        
        
        for(int i=0;i<arr.length;i++)
        {
            if((arr[i]&num)==0)
            {
                if(arr[i]>maxGr1)
                    maxGr1=arr[i];
            }
            else if((arr[i]&num)==num)
            {
                if(arr[i]>maxGr2)
                    maxGr2=arr[i];
            }
        }
        if(maxGr1!=-1 && maxGr2!=-1)
            return maxGr1+maxGr2;
        else
            return -1;
    }
}
