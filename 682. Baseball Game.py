class Solution(object):
    def calPoints(self, ops):
        """
        :type ops: List[str]
        :rtype: int
        """
        valid=[]
        for o in ops:
            if o == "+":
                valid.append(valid[-1]+valid[-2])
            elif o == "C":
                valid.remove(valid[-1])
            elif o == "D":
                valid.append(2*valid[-1])
            else:
                valid.append(int(o))
                
        return sum(valid)
        