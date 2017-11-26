class Solution{
	public int[][] matrix(int[][] nums,int r,int c){
		int n = nums.length;
		int m = nums[0].length;
		if (n*m != r*c){
			return nums;
		}
		int[][] ret = new int[r][c];
		for (int i=0;i < r*c;i++){
			ret[i/c][i%c] = nums[i/m][i%m];
		}
		return ret;
	}
}

