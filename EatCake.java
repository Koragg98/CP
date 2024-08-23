//CodeChef Conest Starter148
//https://www.codechef.com/problems/CAKEHALF?tab=statement
//Let Me Eat Cake!
import java.util.Scanner;

/**
 * @author iraki
 */
class TestCase
{
    private int a,b;
    public TestCase(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    public int eval()
    {
        
        int res=0;
        
        while(a!=b)
        {
            if(a>b)
            {
                res+=(a+1)/2;
                a-=(a+1)/2;
            }
            else
            {    
                res+=(b+1)/2;
                b-=(b+1)/2;
            }
        }
        return res;
    }
}
public class EatCake {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int a,b,n;
		n=sc.nextInt();
		TestCase CaseArr[]=new TestCase[n];
		for(int i=0;i<n;i++)
		{
		    a=sc.nextInt();
		    b=sc.nextInt();
		    CaseArr[i]=new TestCase(a,b);
		}
		for(int i=0;i<n;i++)
		{
		    System.out.println(CaseArr[i].eval());
		}
    }

}

//Alice and Bob both bought a full cake each.
//Alice's cake has 
//A
//A slices, and Bob's cake has 
//B
//B slices.
//
//Alice will be unhappy if she has strictly less slices than Bob does. Similarly, Bob will be unhappy if he has strictly less slices than Alice does.
//
//Charlie doesn't want either of his friends to be unhappy, so he proposes a solution: while either Alice or Bob are unhappy, he will attempt to restore happiness by eating half the remaining slices (rounded up) of whoever has more of them.
//For example,
//
//If 
//A
//=
//8
//A=8 and 
//B
//=
//5
//B=5, Charlie will eat half of Alice's slices, which is 
//8
//2
//=
//4
//2
//8
//​
// =4 slices.
//If 
//A
//=
//2
//A=2 and 
//B
//=
//5
//B=5, Charlie will eat half of Bob's slices, which is 
//5
//2
//2
//5
//​
//  slices - rounded up, this is 
//3
//3 slices.
//How many slices of cake will Charlie eat in total?
//The sample tests below have an explained example.
//
//Input Format
//The first line of input will contain a single integer 
//T
//T, denoting the number of test cases.
//The first and only line of input contains two space-separated integers 
//A
//A and 
//B
//B: Alice's and Bob's initial number of slices.
//Output Format
//For each test case, output on a new line the number of slices of cake Charlie will eat.
//
//Constraints
//1
//≤
//T
//≤
//1
//0
//4
//1≤T≤10 
//4
// 
//1
//≤
//A
//,
//B
//≤
//100
//1≤A,B≤100
//Sample 1:
//Input
//Output
//4
//10 8
//13 13
//28 100
//3 14
//14
//0
//122
//11
//Explanation:
//Test case 
//1
//1: Initially, Alice has 
//10
//10 slices and Bob has 
//8
//8. Charlie will do the following:
//
//Alice has more slices, so Charlie will eat 
//10
//2
//=
//5
//2
//10
//​
// =5 of them.
//Now, Alice has 
//5
//5 slices and Bob has 
//8
//8.
//Bob has more slices, so Charlie will eat 
//8
//2
//=
//4
//2
//8
//​
// =4 of them.
//Now, Alice has 
//5
//5 slices and Bob has 
//4
//4.
//Alice has more slices, so Charlie will eat 
//5
//2
//2
//5
//​
//  of them. This rounds up to 
//3
//3.
//Alice is left with 
//2
//2 slices, and Bob with 
//4
//4.
//Charlie will eat half of Bob's slices, which is 
//4
//2
//=
//2
//2
//4
//​
// =2.
//Alice and Bob both have 
//2
//2 slices now, so neither is unhappy.
//Charlie ate a total of 
//5
//+
//4
//+
//3
//+
//2
//=
//14
//5+4+3+2=14 slices.
//
//Test case 
//2
//2: Neither Alice nor Bob are unhappy since 
//A
//=
//B
//A=B, so Charlie doesn't get to eat anything.
//
//Test case 
//4
//4: Charlie will first eat 
//7
//7 slices from Bob, leaving him with 
//7
//7.
//Then, he'll eat 
//4
//4 slices from Bob again, after which Alice and Bob both have 
//3
//3 slices.
