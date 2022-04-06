/* Вывести на экран большее из двух целых чисел. */

//решение
fun main() {
    val number1: Int = 12
    val number2: Int = 8

    val max: Int = if (number1 > number2)
        number1
    else
        number2

    println(max)
}