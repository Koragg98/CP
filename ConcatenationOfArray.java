package ProblemSolving;
/**
 * @author iraki
 */
public class ConcatenationOfArray {
    
    public static int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int arr[]=new int[2*n];
//        for(int i=0;i<arr.length;i++)
//        {
//            if(i>=nums.length)
//            {
//                int index=i-nums.length;
//                arr[i]=nums[index];
//            }
//            else
//                arr[i]=nums[i];
//        }
//        for(int i=0;i<n;i++)
//        {
//            arr[i]=nums[i];
//            arr[i+n]=nums[i];
//        }
        // for(int i=0;i<arr.length;i++)
        // {
        //     arr[i]=nums[i%nums.length];
        // }
        System.arraycopy(nums, 0, arr, 0, n);
        System.arraycopy(nums, 0, arr, n, n );      //src,src pos,dest,dest pos,length (length means how long will be copled)
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        int arr2[]=getConcatenation(arr);
        for(int x:arr2)
            System.out.print(x+" ");
    }

}
