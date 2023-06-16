class Solution {
    int output = Integer.MAX_VALUE;

    public int jump(int[] nums) {
        backtrack(0, 0, nums);
        return output;
    }

    private void backtrack(int Jumps,int currPosition,int[] nums){
        if(currPosition==nums.length-1) {
            output = Math.min(Jumps, output);
            return;
        }
        else if(Jumps>output) return;
        else{
            for (int i = nums[currPosition]; i > 0 ; i--) {
                if(i+currPosition>nums.length-1){
                    Jumps++;
                    return;
                }
                else backtrack(Jumps+1, i+currPosition, nums);      
            }
        }
    } 
}