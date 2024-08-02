fun main(){

    val james = Guy()
    james.actualAge = 15
    james.age = 15

    println("James: actual age = ${james.actualAge}")
    println("James: pretended age = ${james.age}")

    println("\n ---")

    val peter = Guy()
    peter.actualAge = 35
    peter.age = 35

    println("Peter: actual age = ${peter.actualAge}")
    println("Peter: pretended age = ${peter.age}")

}
class Guy{
    var age: Int = 0
        get() {
            println("> age has been accessed")
            return field
        }
        set(value){
            field = when{
                value < 18 -> 18
                value in 18..30 -> value
                else -> value -3
            }

            println("> age has been set")
        }
    var actualAge = 0
}