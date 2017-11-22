

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
            list.add(list.peekLast() + list.get(list.size() - 2));
            sum += list.peekLast();
        }
        else {
            list.add(Integer.parseInt(op));
            sum += list.peekLast();
        }
	}
	return sum;

}