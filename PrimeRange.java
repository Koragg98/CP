import java.util.*;
public class Solution {

	// public static boolean isPrime(int n)
	// {
	// 	if(n<=1) return false;
	// 	for(int i=2;i*i<=n;i++)
	// 	{
	// 		if(n%i==0)
	// 			return false;
	// 	}
	// 	return true;
	// }
	public static ArrayList<Integer> primeNumbersTillN(int N) 
	{ 
	 	// Write your code here
		ArrayList<Integer> ans= new ArrayList<>();
		// for(int i=2;i<=N;i++)
		// {
		// 	if(isPrime(i)) ans.add(i);
		// }
		if(N<=1) return ans;
		
		boolean isPrime[]=new boolean[N+1];
		for(int i=2;i<=N;i++)
			isPrime[i]=true;
		
		for(int i=2;i*i<=N;i++)
		{
			if(isPrime[i])
			{
				for(int j=i*i;j<=N;j+=i)
				{
					isPrime[j]=false;
				}
			}
		}

		for(int i=2;i<=N;i++)
		{
			if(isPrime[i]) ans.add(i);
		}
		return ans;
	}
	
}
