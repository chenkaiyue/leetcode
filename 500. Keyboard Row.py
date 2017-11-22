class Solution(object):
	def findwords(self,words):
		a=set('qwertyuiop')
        b=set('asdfghjkl')
        c=set('zxcvbnm')
        ans=[]
        for word in words:
        	temp = set(word.lower())
        	if a&t == t:
        		ans.append(word)
        	if b&t==t:
                ans.append(word)
            if c&t==t:
                ans.append(word)
        return ans


    


    def findwords(self,words):
    	return filter(re.compile((?i)([qwertyuiop]*|[asdfghjkl]*|[zxcvbnm]*)$).match,words)