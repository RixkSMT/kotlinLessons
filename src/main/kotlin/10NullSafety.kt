fun main() {
    var num :Int? = 2

    num = null

    var str : String? = null

    str?.let { println("${str.length}")
                       println("${str.uppercase()}")

    }
    str.let { println("${str?.length}")
            println("${str?.uppercase()}")
    }

    var length : Int = if (str != null) str.length else -1
    println(length)

    var length1 = str?.length ?: -1
    println(length1)

    var str1 = "words"
    println(str1.length ?: -1)
    println(str?.length ?: -1)
    println("this is ${str1!!.length}")

}