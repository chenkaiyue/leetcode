class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int ret = 0;
        for(int num : nums){
            if (!map.containsKey(num)){
                map.put(num,1);
            }
            else{
                map.put(num,map.get(num)+1);
            }
            if (map.get(num)>nums.length/2){
                ret = num;
                break;
            }
        }
        return ret;
    }
    

    public int majorityElement(int[] nums) 
    {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

    public int majorityElement(int[] nums) {
    {
        int count = 0,ret=0;
        for (int num: nums) {
            if (count==0)
                ret = num;
            if (num!=ret)
                count--;
            else
                count++;
        }
        return ret; 
    }


}