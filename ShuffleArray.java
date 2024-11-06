//https://leetcode.com/problems/shuffle-the-array/
class Solution {
    public int[] shuffle(int[] nums, int n) {
        // int shuffleArray[]=new int[2*n];
        // int count=0;
        // for(int i=0;i<2*n;i+=2)
        // {
        //     shuffleArray[i]=nums[count];
        //     shuffleArray[i+1]=nums[n+count];
        //     count++;
        // }
        // return shuffleArray;

        // for(int i=0;i<n;i++)
        // {
        //     nums[i]|=(nums[i+n]<<10);
        // }
        // for(int i=n-1;i>=0;i--)
        // {
        //     int x=nums[i]&1023;
        //     int y=nums[i]>>10;
        //     nums[2*i]=x;
        //     nums[2*i+1]=y;
        // }
        for(int i=0;i<2*n;i++)
        {
            int currNum=nums[i];
            int currPos=i;
            while(currNum>0)
            {
                int newPos;
                if(currPos<n)
                    newPos=2*currPos;
                else
                    newPos=2*(currPos-n)+1;
                int newNum=nums[newPos];
                nums[newPos]=-currNum;
                currPos=newPos;
                currNum=newNum;
            }
        }
        for(int i=0;i<2*n;i++)
        {
            if(nums[i]<0)
            {
                nums[i]=-nums[i];
            }
        }
        return nums;
    }
}
