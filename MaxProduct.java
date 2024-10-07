package ProblemSolving;
import java.util.*;
/**
 * @author iraki
 */
public class MaxProduct {

    public static long maximumProduct(int n, int[] arr, int l, int r) {
        // code here
        long max1=Long.MIN_VALUE,max2=Long.MIN_VALUE;
        long min1=Long.MAX_VALUE,min2=Long.MAX_VALUE;
        l--;r--;
        for(int i=0;i<n;i++)
        {
            if(i>=l && i<=r)
            {
                if(arr[i]>max1)
                {
                max1=arr[i];
                }
                if(arr[i]<min1)
                {
                min1=arr[i];
                } 
            }
            else
            {
                if(arr[i]>max2)
                {
                max2=arr[i];
                }
                if(arr[i]<min2)
                {
                min2=arr[i];
                } 
            }
        }
        
        // for(int i=l;i<=r;i++)
        // {
            // if(arr[i]>max1)
            // {
            //     max1=arr[i];
            // }
            // if(arr[i]<min1)
            // {
            //     min1=arr[i];
            // }
        // }
        
        // for(int i=0;i<l;i++)
        // {
        //     if(arr[i]>max2)
        //     {
        //         max2=arr[i];
        //     }
        //     if(arr[i]<min2)
        //     {
        //         min2=arr[i];
        //     }
        // }
        // for(int i=r+1;i<n;i++)
        // {
        //     if(arr[i]>max2)
        //     {
        //         max2=arr[i];
        //     }
        //     if(arr[i]<min2)
        //     {
        //         min2=arr[i];
        //     }
        // }
        
        // Adjust l and r to be zero-based for easier handling
        // l--; // Convert to 0-based index
        // r--; // Convert to 0-based index
        
        // // Create subarrays
        // int[] subArr = Arrays.copyOfRange(arr, l, r + 1); // from l to r inclusive
        // int[] remainingArr = new int[n - (r - l + 1)];
        
        // // Fill remainingArr with elements outside the [l, r] range
        // System.arraycopy(arr, 0, remainingArr, 0, l); // Copy elements before l
        // System.arraycopy(arr, r + 1, remainingArr, l, n - r - 1); // Copy elements after r
        
        // // Sort both arrays to find max and min pairs
        // Arrays.sort(subArr);
        // Arrays.sort(remainingArr);
        
       
        // min1=subArr[0]; max1=subArr[subArr.length-1];
        // min2=remainingArr[0]; max2=remainingArr[remainingArr.length-1];
        return Math.max(Math.max((max1*max2),(min1*min2)),
                        Math.max((max1*min2),(min1*max2)));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int l=sc.nextInt();
        int r=sc.nextInt();
        System.out.println(maximumProduct(n,arr,l,r));
    }

}
