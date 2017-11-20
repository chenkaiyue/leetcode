package main

import (
	"sort"
	"fmt"
)

func main(){
	sum123()
}
func sum123(){
	//sum := 0
	nums := []int{1,4,3,2}
	//p := sort.IntSlice(nums).Sort()
	//sort.IntSlice(nums).Sort()
	//fmt.Println(p)
	//fmt.Println(nums)
	//for i := 0; i < len(nums); i += 2 {
	//	sum += nums[i]
	//}
	//return sum

	//方法一
	sort.Sort(sort.IntSlice(nums))
	fmt.Println(nums)
	//方法二
	sort.Ints(nums)
	fmt.Println(nums)
}