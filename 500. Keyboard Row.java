public class Solution{
	public String[] findWords(String[] words){
		String strs = ["QWERTYUIOP","ASDFGHJKL",,"ZXCVBNM"]
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for (int i=0;i<strs.length;i++){
			for(char c :strs[i].toCharArray(){
				map.put(c,i);
			}
		}
		List<String> res = new LinkedList<String>();
		for(String w : words){
			if (w.equals(""))
				continue;
			int index = map.get(w.toUppercase().charAt(0));
			for (char c:w.toUppercase().toCharArray()){
				if (map.get(c) != index){
					index = -1;
					break;
				}
			}
			if (index != -1)
				res.add(w);
		}
		return res.toArray(new String[0]);
	}



	public String[] findWords(String[] words){
		char[] word = words.toCharArray()
		int i=0;
		int j = words.length();
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
}