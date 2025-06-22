class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a=0,b=0;
        
        /// 2 loop
        // for(int i=0;i<nums.length-1;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i] + nums[j] == target){
        //             a = i;
        //             b = j;
        //         }
        //     }
        // }
        // return new int[]{a,b};


        /// sorting


        /// hashmap 2 pass
        // HashMap<Integer,Integer> hs = new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     hs.put(nums[i], i);
        // }
        // for(int i=0;i<nums.length;i++){
        //     int diff = target - nums[i];
        //     if(hs.containsKey(diff) && hs.get(diff) != i){
        //         a = i;
        //         b = hs.get(diff);
        //         break;
        //     }
        // }
        // return new int[]{a,b};

        /// hashmap 1 pass
        HashMap<Integer,Integer> hs = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int diff = target - nums[i];

            if(hs.containsKey(diff)){
                b = i;
                a = hs.get(diff);
                break;
            }

            hs.put(nums[i],i);
        }

        return new int[] {a,b};

    }
}
