//https://www.codechef.com/problems/EVENHATE
import java.util.*;
import java.lang.*;
import java.io.*;

class EvenNumbersHate
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		/*
		prefixSum[i]=a[0]+a[1]+....+a[i]
		prefixSum[i]=prefixSum[i-1]+a[i];
		
		Goal: prefixSum[] contains maximum odd elements
		 odd+odd=even, even+even=odd, even+odd=odd, odd+even=odd
		
		we may arrange the elements like this:
		a[]-> {odd,even,even,...,even,odd,odd,...,odd}
		prefixSum[]-> {odd,odd,odd,...,odd,even,odd,...even}
		
		score=1+cntOfEven+(cntOfOdd-1)/2
		*/
		
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
		{
		   int N=sc.nextInt();
		   int a[]=new int[N];
		   for(int i=0;i<N;i++)
		    a[i]=sc.nextInt();
		   int cntOfEven=0,cntOfOdd=0;
		   for(int i=0;i<N;i++)
		   {
		       if(a[i]%2==0) cntOfEven++;
		       else cntOfOdd++;
		   }
		   if(cntOfOdd==0) 
		    System.out.println(0);
		   else
		   {
		       int score=1+cntOfEven+(cntOfOdd-1)/2;
		       System.out.println(score);
		   }
		}
	}
}
