fun main() {

    integerValue()
    byteValue()
    shortValue()
    longValue()

}

fun integerValue() {

    val integerMaxValue: Int = Int.MAX_VALUE
    val integerMinValue: Int = Int.MIN_VALUE

    println("Integer Max Value = $integerMaxValue")
    println("Integer Min Value = $integerMinValue")
}

fun byteValue() {

    val byteMaxValue : Byte = Byte.MAX_VALUE
    val byteMinValue : Byte = Byte.MIN_VALUE

    println("Byte Max Value = $byteMaxValue")
    println("Byte Min Value = $byteMinValue")


}

fun shortValue(){

    val shortMaxValue : Short = Short.MAX_VALUE
    val shortMinValue : Short = Short.MIN_VALUE

    println("Short Max Value = $shortMaxValue")
    println("Short Min Value = $shortMinValue")

}

fun longValue(){

    val longMaxValue : Long = Long.MAX_VALUE
    val longMinValue : Long = Long.MIN_VALUE

    println("Long Max Value = $longMaxValue")
    println("Long Min Value = $longMinValue")
}