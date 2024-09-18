//RangeMinimizer
//https://www.codechef.com/problems/MNR?tab=statement
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		
		while(T-->0)
		{
		    int N=sc.nextInt();
		    int arr[]=new int[N];
		    
		    for(int i=0;i<N;i++)
		    {
		        arr[i]=sc.nextInt();
		    }
		    if(N<3)
		        System.out.println(0);
		    else
		    {
		        Arrays.sort(arr);
		        //Remove two smallest or two largest or one smallest one largest
		        int minRange=Math.min(arr[N-1]-arr[2],Math.min(arr[N-3]-arr[0],arr[N-2]-arr[1]));
		        System.out.println(minRange);
		    }
		    
		}

	}
}
