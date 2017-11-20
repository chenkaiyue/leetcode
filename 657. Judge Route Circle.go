func judgeCircle(moves string) bool {
    x,y := 0,0
    for i:=0;i<len(moves);i++{
        c := moves[i] //moves[i]这种都是byte,所以要转换成string
        switch c{
        case 'L':
            x += -1
        case 'R':
            x += 1
        case 'U':
            y += 1
        case 'D':
            y += -1
        }
    }
    return (x==0) && (y==0) 
}


func judgeCircle(moves string) bool {
	x,y := 0,0
	for i:=0;i<len(moves);i++{
		c := string(moves[i]) //moves[i]这种都是byte,所以要转换成string
		switch c{
		case "L":
			x += -1
		case "R":
			x += 1
		case "U":
			y += 1
		case "D":
			y += -1
		}
	}
	return (x==0) && (y==0)
}

