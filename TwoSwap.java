//{ Driver Code Starts
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine()); // Read number of test cases

        // Loop through each test case
        while (t-- > 0) {
            String input = scanner.nextLine();
            String[] inputArr = input.split(" ");
            List<Integer> arr = new ArrayList<>();

            // Convert input to list of integers
            for (String str : inputArr) {
                arr.add(Integer.parseInt(str));
            }

            Solution ob = new Solution();
            boolean ans = ob.checkSorted(arr);

            // Output result
            if (ans)
                System.out.println("true");
            else
                System.out.println("false");
        }

        scanner.close();
    }
}

// } Driver Code Ends




class Solution {

    public boolean checkSorted(List<Integer> arr) {
        // code here
        int n=arr.size();
        int i=0,cnt=0;         
        while(i<n)         
        {             
            if(arr.get(i)==i+1)               
              i++;             
            else             
            {                 
                int temp=arr.get(i);                 
                arr.set(i,arr.get(temp-1));                
                arr.set(temp-1,temp);                
                cnt++;             
            }             
            if(cnt>2) return false;        
            
        }         
        return (cnt==2||cnt==0);
    }
}
