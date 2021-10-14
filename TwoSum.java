import java.util.Scanner;
public class TwoSum{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int t=sc.nextInt();
		Solution s=new Solution();
		int ret[]=s.twoSum(arr,t);
		for(int i=0;i<2;i++){
			System.out.print(ret[i]+"\t");
		}
	}
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ret[]=new int[2];
        int f=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(i!=j){
                    if(target==nums[i]+nums[j]){
                        ret[0]=i;
                        ret[1]=j;
                        f=1;
                        break;
                    }
                }
            }
            if(f==1){
                break;
            }
        }
        return ret;
    }
}
