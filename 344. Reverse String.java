class Solution{
	public String reverString(String s){
		StringBuilder ret = new StringBuilder(s);
		return ret.reverse().toString();
	}
}

	public String[] findWords(String s){
		char[] word = s.toCharArray()
		int i=0;
		int j = s.length();
		while (i < j){
			char temp = word[i];
            word[i] = word[j];
            word[j] = temp;
            i++;
            j--;
		}
		return new String(word)
	}



	public String reverseString(String s) {
        byte[] bytes = s.getBytes();
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            byte temp = bytes[i];
            bytes[i] = bytes[j];
            bytes[j] = temp;
            i++;
            j--;
        }
        return new String(bytes);
    }