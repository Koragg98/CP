package ProblemSolving;

/**
 * @author iraki
 */
public class BuildArray {

    public static int[] buildArray(int[] nums) {
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            ans[i]=nums[nums[i]];
        }
        return ans;
    }
    public static int[] buildArray2(int[] nums)
    {
        return build(nums,0);
    }
    public static int[] build(int[] nums,int start)
    {
        if(start<nums.length)
        {
            int temp=nums[nums[start]];
            build(nums,start+1);
            nums[start]=temp;
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 5, 3, 4};
        int[] result = buildArray(nums);
        int[] result2 = buildArray2(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
        for (int num : result2) {
            System.out.print(num + " ");
        } 
    }
}
