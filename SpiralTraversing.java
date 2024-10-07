package ProblemSolving;
import java.util.*;
/**
 * @author iraki
 */
public class SpiralTraversing {

    public static ArrayList<Integer> boundarySum(int n, int[][] matrix) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        
        int sr=0,sc=0,er=n-1,ec=n-1;
        int count=0;
        while(count<n*n)
        {
            //upper row
            int sum=0;
            for(int i=sc;i<=ec;i++)
            {
                sum+=matrix[sr][i];
                count++;
            }
            sr++;
            //right column
            for(int i=sr;i<=er;i++)
            {
                sum+=matrix[i][ec];
                count++;
            }
            ec--;
            //bottom row
            for(int i=ec;i>=sc;i--)
            {
                sum+=matrix[er][i];
                count++;
            }
            er--;
            //left column
            for(int i=er;i>=sr;i--)
            {
                sum+=matrix[i][sc];
                count++;
            }
            sc++;
            res.add(sum);
        }
        return res;
    }
    public static void main(String[] args) {
        //int res[][]={{1,2,3,4},{2,3,4,5},{4,1,5,2},{3,2,9,0}};
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                res[i][j]=sc.nextInt();
            }
        }
        System.out.println(boundarySum(n,res));
    }

}
