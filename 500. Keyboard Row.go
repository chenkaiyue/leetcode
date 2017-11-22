func findWords(words []string)[]string{
	s1 := "qwertyuiop"
	s2 := "asdfghjkl"
	s3 := "zxcvbnm"

	m := map[rune]int{}
	// m2 := map[rune]bool{}
	// m3 := map[rune]bool{}

	var ret []string

	for _,ch := range(s1){
		m[ch]=1	
	} 
	for _,ch := range(s2){
		m[ch]=2	
	}
	for _,ch := range(s3){
		m[ch]=3	
	}

		

	for _,s:=range words{
		ch := rune(s[0])
		if ch < 'a'{
			ch += 32
		}
		index := m[ch]
		flag := true
		for _,c := range s{
			if c < 'a'{
				c += 32
			}
			if m[c] != index{
				flag = false
				break
			}
		}
		if flag{
			ret = append(ret,s)
		}
	}

	return ret
}

