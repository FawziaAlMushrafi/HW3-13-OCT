//Unit = If a function does not return a useful value
// its return type is Unit. Unit is a type with only one value

fun main():Unit {
    val min: Int = getmin(num1 = 8, num2 = 4)
    println(min)
}
fun getmin(num1:Int,num2:Int) :Int{
    if (num1<num2){
        return num1

    } else{
        return  num2
    }
    println("The NOT BE BRINTED")

}