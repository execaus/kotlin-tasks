/*
Напишите класс прямоугольника (Rectangle) с полями width и height (ширина и высота), инициализирующимися через конструктор.
Добавьте в него функции, которые будут считать площадь (width*height) и периметр прямоугольника (2*(width+height))
Добавьте функцию, которая будет отвечать на вопрос является ли этот прямоугольник квадратом (равны ли его стороны)
Создайте объект класса Rectangle и проверьте работоспособность написанных функций

Для этой задачи есть видео с разбором.
*/

class Rectangle(val width: Double, val height: Double){
    fun area(): Double{
        return width*height
    }

    fun length(): Double{
        return 2*(width+height)
    }

    fun isSquare(): Boolean{
        return width==height
    }
}

fun main() {
    val rectangle = Rectangle(4.5,1.2)

    println(rectangle.area())
    println(rectangle.length())
    println(rectangle.isSquare())
}