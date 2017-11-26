class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int gl = g.length;
        int sl = s.length;
        int i=0,j=0,count=0;
        while (i<gl && j<sl){
            if (g[i] <= s[j]){
                i++;
                j++;
                count++;
            }else{
                j++;
            }
        }
        return count;
    }
}