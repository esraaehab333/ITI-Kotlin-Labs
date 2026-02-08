import kotlin.random.Random


fun main (){
    val size = 100
    val randomArray = IntArray(size) { Random.nextInt(1, 101) }
    println("numbers less than or equal to 10:")
    randomArray.filter { it <= 10 }.forEach { print("$it ,") }
}