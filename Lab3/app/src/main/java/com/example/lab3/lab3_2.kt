interface Number{
    var start :Int
    var current:Int
    fun reset()
    fun getNext():Int
}
class ByThree :Number{
    override var current: Int =0
    override var start: Int =0
        set(value) {
            field=value
            current=value
        }
    override fun reset() {
        current=start
    }
    override fun getNext():Int {
        current+=3
        return current
    }
}
fun main(){
    val byThree = ByThree()
    var ref :Number
    repeat(5){
        ref=byThree
        println("By Three : ${ref.getNext()}")
    }
}