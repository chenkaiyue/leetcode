func reverseString(s string)string {
	runes := []rune(s)
	for from,to:=0,len(runes)-1;from<to;from,to=from+1,to-1{
		runes[from],runes[to] = runes[to],runes[from]
	}
	return string(runes)
}

func reverseString(s string)string {
	var b bytes.Buffer
	for i:=0;i<len(s)-1;i++{
		b.WriteString(string(s[len(s)-1-i]))
		b.WriteString(s[len(s)-1-i,len(s)-i])
	}
	return b.String()
}


func reverseString(s string)string {
	var r []byte
	for i := 0; i < len(s); i++ {
        r = append(r, byte(s[len(s) -i - 1])) //这个byte其实不用加，本来就是byte
    }
    return string(r)
}
