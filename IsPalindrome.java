import java.util.Scanner;
public class IsPalindrome{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Solution s=new Solution();
		boolean ret=s.isPalindrome(n);
		System.out.print(ret);
	}
}
class Solution {
    public boolean isPalindrome(int x) {
        boolean ret=false;
        StringBuilder sb=new StringBuilder(String.valueOf(x));
        sb.reverse();
        if(String.valueOf(sb).equals(String.valueOf(x))){
            ret=true;
        }
        return ret;
    }
}