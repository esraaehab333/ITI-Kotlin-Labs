class Person{
    lateinit var name :String // i want to give this value later
    lateinit var id :String
    lateinit var gender:String
}
fun main (){
    val personObject1 = Person().let {
        it.name="Esraa"
        it.gender="Female"
        it.id="1"
        println("Using let: ${it.name}")
        it
    }
    val personObject2 = Person().run {
        name="Esraa"
        gender="Female"
        id="1"
        println("Using run: ${this.name}")
    }
    val personObject3 = Person().also {
        it.name="Esraa"
        it.gender="Female"
        it.id="1"
        println("Using also: ${it.name}")
    }
    println(personObject1)
    println(personObject2)
    println(personObject3)
}