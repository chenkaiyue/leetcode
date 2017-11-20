class Sulution(object):
	def judgeCircle(self,moves):
		moves.count('L') == moves.count('R') and  moves.count('U') == moves.count('D')
