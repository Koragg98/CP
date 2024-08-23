/**
 * @author iraki
 */
public class NumberComplement {

    public static int findComplement(int num) 
    {
//        String str=Integer.toBinaryString(num);
//        StringBuilder str2=new StringBuilder();
//        str2.append(str);
//        for(int i=0;i<str2.length();i++)
//        {
//            if(str2.charAt(i)=='0')
//                str2.setCharAt(i, '1');
//            else
//                str2.setCharAt(i, '0');
//        }
//        return Integer.parseInt(str2.toString(),2);
        int m=(Integer.highestOneBit(num)<<1)-1;
        return num^m;
    }
    public static void main(String[] args) {
        System.out.println(NumberComplement.findComplement(5));
        System.out.println(~5);
    }
}
