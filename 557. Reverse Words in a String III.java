class Solution {
    public String reverseWords(String s) {
        String[] s1 = s.split(" ");
        StringBuffer ret = new StringBuffer("");
        for (String s2:s1){
            ret.append(new StringBuffer(s2).reverse().toString());
            ret.append(" ");
        }
        return ret.toString().trim();
    }
}

class Solution{
	public String reverseWords(String s){
		String[] s1 = s.split(" ");
		for (int i=0;i<s1.length;i++){
			s1[i] = new StringBuilder(s1[i]).reverse().toString();
		}
		StringBuilder result = new StringBuilder();
		for (String st:s1)
			result.append(st+" ");
		result.toString().trim()
	}
}