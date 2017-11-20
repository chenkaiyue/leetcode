class Solution(object):
    def reverseWords(self, s):
        """
        :type s: str
        :rtype: str
        """
        ret = []
        l1 = s.split(" ")
        for s2 in l1:
            ret.append(s2[::-1])
        return " ".join(ret)