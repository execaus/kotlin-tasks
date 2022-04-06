/*
Написать функцию, которая возвращает большее из двух целых чисел.

Проверить работу написанной функции на примере каких-нибудь входных данных.
 */

//функция - это основа этого задания
fun maxNumber(number1: Int, number2: Int): Int {
    val max = if (number1 > number2)
        number1
    else
        number2
    return max
}

//проверка работы функции
fun main() {
    val a: Int = 7
    val b: Int = 9

    val result = maxNumber(a,b)

    println(result)
}

