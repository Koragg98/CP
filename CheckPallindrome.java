
import java.util.Scanner;

/**
 * @author iraki
 */
public class CheckPallindrome {

    public static boolean isPallindrome(int n)
    {
        boolean flag=false;
        if(n<0)
            flag=false;
        else
        {
            int rev=0;
            int num=n;
            while(num!=0)
            {
                rev=rev*10+(num%10);
                num/=10;   
            }
            if(rev==n)
                flag=true;
        }
        return flag;
    }
    public static boolean isPallindrome(String n)
    {
        String str=n;
        int l=0;
        int h=str.length()-1,flag=1;
        while(l<=h)
        {
            if(str.charAt(l)!=str.charAt(h))
            {   
                flag=0;
                break;
            }
                
            else
            {   
                l++;
                h--;
            }
        }
        return flag==1;
    }
    public static void main(String[] args) {
        System.out.println(CheckPallindrome.isPallindrome(556));
    }
}
