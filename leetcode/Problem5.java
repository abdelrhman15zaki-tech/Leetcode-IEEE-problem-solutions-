class Problem5 {
    public int[] twoSum(int[] nums, int target) {
        int b=0;
        int a=0;int c=0;
        for(int i=0;i< nums.length;i++){
            for(int j=0;j< nums.length;j++){
                if(j!=i){
                if(nums[i]+nums[j]==target){
                    System.out.println("["+i+", "+j+"]");
                    b=1;
                    a=i;c=j;
                    break;
                }}

        }
            if(b==1){
                break;
            }


    }
    return new int[] { a, c };}
}