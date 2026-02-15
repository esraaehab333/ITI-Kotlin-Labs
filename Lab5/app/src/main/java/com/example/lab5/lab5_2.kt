typealias Operation = (Double,Double)->Double
fun calc(a:Double, b:Double,op:Operation):Double{
    return op(a,b)
}
fun main (){
    println("Enter Number 1 :")
    val numberInput1 = readLine()
    val number1= numberInput1?.toDoubleOrNull()
    if(number1==null){
        println("Invalid Number!!")
        return
    }
    println("Enter the operator from (+ , * , - , / ) :")
    val operator = readLine()
    println("Enter Number 2 :")
    val numberInput2 = readLine()
    val number2= numberInput2?.toDoubleOrNull()
    if(number2==null){
        println("Invalid Number!!")
        return
    }
    val result = when (operator){
        "*"->calc(number1,number2){x,y->x*y}
        "+"->calc(number1,number2){x,y->x+y}
        "-"->calc(number1,number2){x,y->x-y}
        "/"->{
            if(number2==0.0)return println("Error:Division by zero")
            calc(number1,number2){x,y->x/y}
        }
        else->{
            println("Invalid operator")
            return
        }
    }
    println("Result : $result")
}