func distributeCandies(candies []int)int{
	candiesMap := map[int]int{}
	// candiesMap := make(map[int]int)
	for _,i := range cnadies{
		if _,ok := candiesMap[i];ok{
			candiesMap[i]++
		}else{
			candiesMap[i] = 1
		}
	}
	if len(candiesMap) <= len(candies)/2{
		return len(candiesMap)
	}else{
		return len(candies)/2
	}
}