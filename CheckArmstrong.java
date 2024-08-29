package ProblemSolving;

/**
 * @author iraki
 */
public class CheckArmstrong {
    
    public static boolean isArmstrong(int num)
    {
       		int sum=0,temp=num;
		while(temp!=0)
		{
			sum+=((temp%10)*(temp%10)*(temp%10));
			temp/=10;
		}
		return num==sum;
    }
    public static void main(String[] args) {
        System.out.println(isArmstrong(154));
    }

}
