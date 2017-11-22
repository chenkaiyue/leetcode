package main

import (
     "fmt"
    "strings"
)
func main(){
	fmt.Println(reverseWords("Let's take LeetCode contest"))
	//fmt.Println(reverse("qweqw"))
}


func reverseWords(s string) string {
	var ret2 []string
	s1 := strings.Split(s," ")
	for _,s2 := range s1{
		ret2 = append(ret2,reverse(s2))
	}
	return strings.Join(ret2," ")
}


//方法二
/*func reverseWords(s string) string {
    var ret string 
    s1 := strings.Split(s," ")
    for _,s2 := range s1{
        ret += reverse(s2)
        ret += " "
    }
    return strings.Trim(ret," ")
}*/

func reverse(s string) string{
    runes := []rune(s)
    for from,to:=0,len(runes)-1;from<to;from,to=from+1,to-1{
        runes[from],runes[to] = runes[to],runes[from]
    }
    return string(runes)
}