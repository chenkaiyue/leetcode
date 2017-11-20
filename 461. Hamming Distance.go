package main

import "fmt"

func main(){
    fmt.Println(hammingDistance(5,7))
}


func hammingDistance(x int, y int) int {
    f := x ^ y;
    ret := 0;


    //for (f > 0) {
    //    f &= f-1
    //    ret ++
    //}

    for i:=0;i<32;i++{
        ret += (f >> uint64(i)) & 1
    }
    return  ret;
}