import java.util.*;
public class LongestCommonPrefix{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String str[]=sc.nextLine().split(" ");
		Solution s=new Solution();
		String a=s.longestCommonPrefix(str);
		System.out.println(a);
	}
}
class Solution {
    public String longestCommonPrefix(String[] strs) {
        int f=0;
        String str="";
        for(int i=0;i<strs[0].length();i++){
            char ch=strs[0].charAt(i);
            int in=1;
            for(int j=1;j<strs.length;j++){
                if(i<strs[j].length()){
                    if(strs[j].charAt(i)==ch){
                        in++;
                    }
                    else{
                        f=1;
                        break;
                    }
                }
                else{
                    f=1;
                    break;
                }
            }
            if(f==1){
                break;
            }
            else if(in==strs.length){
                str+=ch;
            }
        }
        return str;
    }
}