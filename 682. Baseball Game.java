

public int calPoints(String[] ops){
	// int[] re = New int[]{}
	int sum = 0;
	List<Integer> l = new LinkedList<>(); 
	for (String str:ops){
		if (str.equals("C")){
			sum -= l.removeLast()
		}
		else if (str.equals("D")){
			l.add(l.peekLast()*2);
			sum += l.peekLast()
		}
		else if (op.equals("+")) {
            l.add(l.peekLast() + l.get(l.size() - 2));
            sum += l.peekLast();
        }
        else {
            l.add(Integer.parseInt(op));
            sum += l.peekLast();
        }
	}
	return sum;

}