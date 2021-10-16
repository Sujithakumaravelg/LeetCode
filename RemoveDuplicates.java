import java.util.*;
public class RemoveDuplicates {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String str[]=sc.nextLine().split(" ");
        int arr[]=new int[str.length];
        for(int i=0;i<str.length;i++){
            arr[i]=Integer.parseInt(str[i]);
        }
        Solution s=new Solution();
        int n=s.removeDuplicates(arr);
        System.out.println(n);
    }
}
class Solution {
    public int removeDuplicates(int[] nums) {
        int in=0;
        for(int i=0;i<nums.length;i++){
            int f=0;
            for(int j=0;j<in;j++){
                if(nums[i]==nums[j]){
                    f=1;
                    break;
                }
            }
            if(f==0){
                nums[in++]=nums[i];
            }
        }
        return in;
    }
}