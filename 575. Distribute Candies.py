class Solution(object):
    def distributeCandies(self, candies):
        """
        :type candies: List[int]
        :rtype: int
        """
        s = set(candies)
        if len(s) >= len(candies)/2:
            return len(candies)/2
        else:
            return len(s)