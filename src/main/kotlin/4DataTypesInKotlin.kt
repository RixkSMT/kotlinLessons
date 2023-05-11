fun main() {
    var int : Int = 1   //also byte, short, long, float, double

    var str : String = "String"
    var boolean :Boolean = true
    var char : Char = 'a'

    //raw string
    var str1 = """ 
          This is $str
    """.trimMargin()
    println(str1)


    println("this is int $int")

}