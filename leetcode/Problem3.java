import java.util.Arrays;
import java.util.Scanner;
class Problem3 {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
 int  n=nums.length;
        if(n==1) return nums[0];
        else{
   for(int i=0;i<n-1;i++){
       if(i==0){if(nums[i]!=nums[i+1]) return nums[i];}
   if(nums[i]!=nums[i+1]&&nums[i]!=nums[i-1]) return nums[i];}}
   
   return nums[n-1];}
}