enum class building{
    villa,apartment
}
data class Person(val name:String, val address:Address){
     data class Address(val streetName:String , val city:String, val building:building)
}
fun main(){
    val person = Person("esraa",Person.Address("6 October", "Giza",building.apartment))
    println("Hello my name is ${person.name} " +
            ", and my address is ${person.address.city}" +
            " street ${person.address.streetName} in" +
            " ${person.address.building}")
}
//class Person(val name:String){
//    inner class Address(val streetName:String , val city:String, val building:building)
//}fun main(){
//    val person = Person("esraa")
//    var address = person.Address("6 October", "Giza",building.apartment)
//    println("Hello my name is ${person.name} " +
//            ", and my address is ${address.city}" +
//            " street ${address.streetName} in" +
//            " ${address.building}")
//}