fun main(args: Array<String>){
    println("Hello, world")
}

fun max(a: Int, b:Int): Int{
    return if(a>b) a else b
}

/*
* fun max(a:Int,b:Int) : Int = if(a>b) a else b
* fun max(a: Int, b:Int) = if(a>b) a else b
* * */

val answer1 = 42
val answer2 : Int = 42
var answer3 : Int = 3

/* val - value 변경 불가 / var - variable 변경 가능
* */
fun test1() { //val 조건 붙여 변수 초기화
    val message: String
    if (true) {
        message = "Success"
    } else {
        message = "Failed"
    }
}

