fun main (){
    val defaultValue :String = "Gust";
    println("Enter Your name :")
    var name:String? = readLine()
    if(name.isNullOrEmpty()){
        name = defaultValue
        println("Hello $defaultValue")
    }else{
        println("Hello $name")
    }
}