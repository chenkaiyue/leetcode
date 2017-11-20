public class Solution{
	public int hammingDistance(int x,int y){
		return Integer.bitcount(x^y);
	}
}

public class Solution{
	public int hamming(int x, int y){
		int xor = x^y,count=0;
		for (int i=0;i<32;i++){
			count += ((x^y) >> i) & 1; 
		}
		return count;
	}
}