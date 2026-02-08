import kotlin.random.Random


fun main (){
    println("Enter Number 1 :")
    val numberInput1 = readLine()
    val number1= numberInput1?.toDoubleOrNull()
    if(number1==null){
        println("Invalid Number!!")
        return
    }
    println("Enter the operator from (+ , * , - , /) :")
    val operator = readLine()
    println("Enter Number 2 :")
    val numberInput2 = readLine()
    val number2= numberInput2?.toDoubleOrNull()
    if(number2==null){
        println("Invalid Number!!")
        return
    }
    val result = when (operator){
        "*"->number1*number2
        "+"->number1+number2
        "-"->number1-number2
        "/"->{
            if(number1!=0.0) number1/number2
            else{
                println("Error:Divison by zero !")
                return
            }
        }
        else->{
            println("Invalid operator")
            return
        }
    }
    println("Result : $result")
}