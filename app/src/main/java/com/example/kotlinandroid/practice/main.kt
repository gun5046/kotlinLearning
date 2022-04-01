package com.example.kotlinandroid.practice

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

val s : String? = null // 널이 될 수있음
val s2 : String ="" // 널이 될수 없음

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
fun test2(){ //
    val languages = arrayListOf("Java")
    languages.add("Kotlin")
}

fun test3(){ // var 변수 값 변경 o 타입 변경 x
    var answer = 42
    // answer = "no answer" 컴파일 오류
    answer = 1
}

fun test4(args: Array<String>){ // $사용
    val name= if(args.size>0) args[0] else "Kotlin"
    println("Hello, $name")
}

class Person(val name : String, val age : Int)
/*프로퍼티, val는 읽기 전용getter, var는 쓰기 읽기 setter, getter 필드는 기본 비공개*/

/*코틀린은 클래스와 함수 import 가 같다*/

enum class Color(
    val r : Int, val g: Int, val b : Int
) {
    RED(255,0,0), ORANGE(255,165,0)
    ,YELLOW(255,255,0), GREEN(0,255,0)
    , INDIGO(75,0,130), VIOLET(238,130,238);
    // enum 상수 목록과 메소드 정의 사이에는 세미콜론;
    fun rgb() = (r*256 + g) * 256 + b

}

fun getMnemonic(color : Color){
    when(color){
        Color.RED -> "Richard"
        Color.ORANGE -> "Of"
        Color.YELLOW -> "York"
        Color.GREEN ->"Gave"
        Color.INDIGO -> "In"
        Color.VIOLET -> "Vain"
    }
}

fun mix (c1: Color, c2 : Color){
    when (setOf(c1, c2)) {
        setOf(Color.RED, Color.YELLOW) -> Color.ORANGE
        setOf(Color.YELLOW, Color.VIOLET) -> Color.GREEN
        else -> throw Exception("Dirty color")
    }
}

fun mixOptimized(c1:Color, c2:Color){
    when {
        (c1 == Color.RED && c2 ==Color.YELLOW) ||
                (c1 == Color.YELLOW && c2 == Color.RED) ->
            Color.ORANGE
    }
}

fun forTest(){
    for(i in 100 downTo 1 step 2){
        print(i)
    }
}

fun recognize(c: Char) =
    when(c){
        in '0'..'9' -> "It's a digit"
        in 'a'..'z' -> "It;s a letter!"
        else -> "I don't know"
    }