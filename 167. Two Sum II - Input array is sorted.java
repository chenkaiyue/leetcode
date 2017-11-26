class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ret = new int[2];
        if (numbers == null || numbers.length < 2)
            return ret;
        for (int i=0,j=numbers.length-1;i<j;){
           if (numbers[i]+numbers[j] == target){
               ret[0]=i+1;
               ret[1]=j+1;
               break;
           } 
           else if (numbers[i]+numbers[j] < target){
               i++;
           }
           else {
               j--;
           }
        }
        return ret;
    }
}