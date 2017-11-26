class Solution {
    public int[] nextGreaterElement(int[] FindNums, int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for (int num : nums){
            while (!stack.isEmpty() && stack.peek() < num)
                map.put(stack.pop(),num);
            stack.push(num);
        }

        for (int i=0;i<FindNums.length;i++){
        	FindNums[i] = map.getOrDefault(FindNums[i],-1);
        }
        return FindNums;
    }
}