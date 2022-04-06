import kotlin.math.sqrt

/*
Добавить класс треугольника (Triangle), который определяется длинами трех сторон.
Сделать его тоже наследником Figure (который вы сделали в предыдущем задании) и прописать работу функций area()
и length() для него

Для этой задачи есть видео с разбором.
*/

class Triangle(color: String, val a: Double, val b: Double, val c: Double): Figure(color){
    override fun area(): Double {
        val p=(a+b+c)/2
        return sqrt(p*(p-a)*(p-b)*(p-c))
    }

    override fun length(): Double {
        return a+b+c
    }
}