import java.util.*;
public class MaxSubArray{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String str[]=sc.nextLine().split(" ");
		int arr[]=new int[str.length];
		for(int i=0;i<str.length;i++){
		    arr[i]=Integer.parseInt(str[i]);
		}
		Solution s=new Solution();
		int a=s.maxSubArray(arr);
		System.out.println(a);
	}
}
class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0],sum;
        for(int i=0;i<nums.length;i++){
            for(int j=nums.length-1;j>=i;j--){
                sum=nums[i];
                for(int k=i+1;k<=j;k++){
                    sum+=nums[k];
                }
                if(max<sum) max=sum;
            }
        }
        return max;
    }
}