class Solution(object):
    def findComplement(self, num):
        count=0
        while num > 0:
            num /= 2
            count+=1
        return ~num &((1<<count)-1)

class Solution(object):
    def findComplement(self, num):
        i=1
        while i <= num:
            i = i<<1
        return (i-1)^num
