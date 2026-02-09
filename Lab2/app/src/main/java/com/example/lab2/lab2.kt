import android.widget.Space

abstract class Shape(initialDim: Double) {
    var dim: Double = initialDim
        get() = field
        set(value) {
            field = value
        }
    abstract fun calcArea(): Double
}
class Rectangle// width is the dim in the shape constructor
    (width: Double, private var height: Double) : Shape(width) {
    fun getHeight():Double{
        return height
    }
    fun setHeight(height: Double){
        this.height = height
    }
    override fun calcArea(): Double {
       return dim*height
        // mean height * width
    }
}
class Circle// dim is the radius
    (radius: Double) : Shape(radius) {
    override fun calcArea(): Double {
        return Math.PI*dim*dim
    }
}
class Triangle(base: Double, private var height: Double) : Shape(base) {
    fun setHeight(height: Double) {
        this.height = height
    }
    fun getHeight(): Double {
        return height
    }
    override fun calcArea(): Double {
        // base from parent and the height from the class
        return 0.5 * dim * height
    }
}
class Picture{
    fun sumAreas(s1:Shape , s2:Shape, s3:Shape):Double{
        return s1.calcArea()+s2.calcArea()+s3.calcArea()
    }
}
fun main (){
    val r = Rectangle(4.0, 5.0)
    val c = Circle(3.0)
    val t = Triangle(6.0, 2.0)
    val picture = Picture()
    println("Sum of areas = ${picture.sumAreas(r, c, t)}")
}