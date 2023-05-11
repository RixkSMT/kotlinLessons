fun main() {

    var num  = 1
    var num1 = 15
    var num3 = 6

    if (num<num1) num else num1
    when(num1){
        5    -> println("num1 is equal to five")
        10   -> println("num1 is equal to ten")
        15   -> println("num1 is equal to 15")
        else -> println("num1 is greater than 15")
    }
    var result =when(num1){
        5    -> "five"
        10   -> "ten"
        15   -> "fifteen"
        else -> "greater than fifteen"
    }
    println(result)

   
}