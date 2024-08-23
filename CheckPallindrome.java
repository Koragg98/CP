
import java.util.Scanner;

/**
 * @author iraki
 */
public class CheckPallindrome {

    public static void main(String[] args) {
        String str;
        Scanner sc=new Scanner(System.in);
        str=sc.next();
        int l=0;
        int h=str.length()-1,flag=0;
        while(l<=h)
        {
            if(str.charAt(l++)==str.charAt(h--))
                flag=1;
            else
            {   
                flag=0;
                break;
            }
        }
        if(flag==1)
            System.out.println("YES");
        else
            System.out.println("NO");
        
    }

}
