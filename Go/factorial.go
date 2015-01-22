package main
import "fmt"
func main() {
    var factorial_of int
    fmt.Println("Hey man! Give me a number and I'll return you the factorial.")
    _, err := fmt.Scanf("%d", &factorial_of)
    if err != nil{
        fmt.Println("I asked you for a number...")
    }else{
        result := 1
        for i := 1; i <= factorial_of; i++ {
            result *= i
        }
        fmt.Println("The factorial of", factorial_of, "is =", result)
    }
}
