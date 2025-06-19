class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        /// using 2 for loop
        // for(int i=0;i<nums.length-1;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i] == nums[j]){
        //             return true;
        //         }
        //     }
        // }
        // return false;

        /// sort array and check
        // Arrays.sort(nums);
        // for(int i=0;i<nums.length-1;i++){
        //     if(nums[i] == nums[i+1]){
        //         return true;
        //     }
        // }
        // return false;

        /// using hashSet
        // HashSet<Integer> hs = new HashSet<Integer>();
        // for(int i=0;i<nums.length;i++){
        //     if(hs.contains(nums[i])){
        //         return true;
        //     }else{
        //         hs.add(nums[i]);
        //     }
        // }
        // return false;

        /// array stream and check length of distinct
        return Arrays.stream(nums)
        .distinct()
        .count() < nums.length;

    }
}
