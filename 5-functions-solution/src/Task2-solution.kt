/*
Написать функцию, которая для двух целых чисел возвращает «первое число больше» если первое больше,
«второе число больше» если второе больше и «числа равны», если они равны

Проверить работу написанной функции на примере каких-нибудь входных данных.
*/

//вариант 1
/*fun numberCompare(number1: Int, number2: Int): String {
    val result = if (number1 > number2)
        "первое число больше"
    else
        if (number2 > number1)
            "второе число больше"
        else
            "Числа равны"
    return result
}*/

//вариант 2
fun numberCompare(number1: Int, number2: Int): String {
    val result = when {
        number1 > number2 -> number1.toString()
        number2 > number1 -> number2.toString()
        else -> "Числа равны"
    }
    return result
}

//проверка работы функции
fun main() {
    val number1: Int = 12
    val number2: Int = 8

    val result = numberCompare(number1, number2)

    println(result)
}