package ProblemSolving;

/**
 * @author iraki
 */
public class CheckArmstrong {
    
    public static boolean isArmstrong(int num)
    {
        int digit=Integer.toString(num).length();
		int unit_digit=0,sum=0,temp=num;
		
		while(temp!=0)
		{
			unit_digit=temp%10;
			sum+=(int)Math.pow(unit_digit,digit);
			temp/=10;
		}
		return num==sum;
    }
    public static void main(String[] args) {
        System.out.println(isArmstrong(154));
    }

}
