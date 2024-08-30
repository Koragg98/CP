package ProblemSolving;

import java.util.Scanner;

/**
 * @author iraki
 */
public class InfiniteRepeatation {

    public static int[] getInfiniteArray(int nums[],int length)
    {
        int ans[]=new int[length];
        for(int i=0;i<length;i++)
        {
           ans[i]=nums[i%nums.length];
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        int n;
        System.out.print("Enter the length: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr2[]=getInfiniteArray(arr,n);
        for(int x:arr2)
            System.out.print(x+" ");
        sc.close();
    }

}
