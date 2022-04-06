/*
Напишите класс круга (Round) с полем radius (радиус), инициализирующимся через конструктор.
Добавьте в него функции, которые будут считать площадь (Math.PI* radius * radius) и длину окружности (2*Math.PI*radius)
Создайте объект класса Round и проверьте работоспособность написанных функций
*/

class Round(val radius: Double){
    fun area(): Double{
        return Math.PI*radius*radius
    }

    fun length(): Double{
        return 2*Math.PI*radius
    }
}

fun main() {
    val round = Round(4.8)

    println(round.area())
    println(round.length())
}