class Complex(val real:Double , val imag:Double){
    // it call the primary constractor
    constructor(real:Double):this(real,0.0)
    operator fun plus(other:Complex):Complex{
        return Complex(real+other.real, imag+other.imag)
    }
    operator fun minus(other:Complex):Complex{
        return Complex(real-other.real, imag-other.imag)
    }
}
fun Complex.print() {
    val sign = if (imag >= 0) "+" else "-"
    println("$real $sign ${kotlin.math.abs(imag)}i")
}
fun createComplex(real: Double = 0.0, imag: Double = 0.0): Complex {
    return Complex(real, imag)
}
fun main (){
    val c1 = Complex(1.0,8.0)
    val c2 = Complex(real = 9.0, imag = 9.0)
    val sum = c1 + c2
    val diff = c1 - c2
    print("Sum: ")
    sum.print()
    print("Difference: ")
    diff.print()
    val c3 = createComplex(imag = 10.0)
    print("Custom: ")
    c3.print()
}