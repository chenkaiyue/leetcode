class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length == 0|| nums2.length == 0)
            return new int[]{};
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> ret = new HashSet<>();

        // int[] ret = new int[]{};
        for (int num : nums1){
            set.add(num);
        }
        for (int num:nums2){
            if (set.contains(num)){
                ret.add(num);
            }
        }
        int[] result = new int[ret.size()];
        int i=0;
        for (Integer num:ret){
            result[i++] = num;
        }
        return result;
    }
}


public boolean binarySearch(int[] nums,num)
{
    int low = 0;
    int high = nums.length -1;
    while (low <= high){
        int mid = low + (high-low)/2;
        if (nums[mid] == num){
            return true;
        }
        if (nums[mid]>num){
            high = mid-1;
        }
        if (nums[mid]<num){
            low = mid + 1;
        }
    }
    return false;
}