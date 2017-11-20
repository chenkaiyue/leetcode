package leetcode

func twoSum(nums []int,target int) []int{
	m := make(map[int]int)
	for i:=0;i<len(nums);i++{
		another := target-nums[i]
		if _,ok := m[another];ok{//是否存在值another
			return []int{m[another],i}
		}
		m[nums[i]] = i
	}
	return nil
}

/*
-------------------------
*/
import (
	"testing"
)

func TestTwoSum(t *testing.T){
	tests := [][]int{
		[]int{3,2,4},
		[]int{0,8, 7, 3, 3, 4, 2},
		[]int{0, 1},
	}

	targets := []int{
		6,
		11,
		1,
	}

	results := [][]int{
		[]int{1,2},
		[]int{1, 3},
		[]int{0, 1},
	}
	caseNum := 3
	for i:=0;i < caseNum;i++{
		if ret:=twoSum(tests[i], targets[i]);ret[0] != results[i][0] && ret[1]!=results[i][1]{
			t.Fatalf("case %d fails: %v\n",i,ret)
		}
	}
}