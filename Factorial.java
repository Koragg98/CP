
import java.util.Scanner;

/**
 * @author iraki
 */
public class Factorial {
    public static int fact(int n)
    {
        if(n==0 || n==1)
            return 1;
        else 
            return n*Factorial.fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.print(Factorial.fact(a));
    }
}
