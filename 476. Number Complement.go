package main

func findComplement(num int) int {
	var valid uint32 = 0
	tmp := num
	for (tmp > 0){
		tmp /= 2
		valid ++
	}
	return ^num & ((1<<valid)-1)  // <<操作必须是uint,位取反是^,不是~
}


func findcom(num int) int{
	i := 1
	for (i <= num){
		i = i << 1
	}
	return num ^ (i-1)
}