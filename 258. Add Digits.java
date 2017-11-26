class Solution {
    public int addDigits(int num) {
        if (num ==0)
            return 0;
        String s=""+num;
        int sum = 0;
        char[] ss = s.toCharArray();
        for (int i=0;i<ss.length;i++){
            sum += Integer.parseInt(""+ss[i]);
        }
        if (sum % 9 == 0)
            return 9;
        else 
            return sum % 9;
    }
}