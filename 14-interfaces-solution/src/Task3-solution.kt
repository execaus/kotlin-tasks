import kotlin.math.sqrt

/*
Создайте коллекцию перемещаемых объектов (которые реализуют интерфейс Movable из предыдущей задачи),
среди которых будут разные геометрические фигуры и животные.
Переместить все элементы коллекции вправо на 10 шагов

Для этой задачи есть видео с разбором.
*/

fun main() {
    val rectangle = Rectangle("green", 4.5,5.6)
    val triangle = Triangle("red", 8.2,2.0,6.8)

    val animal1 =Animal("Tiger")
    val animal2 =Animal("Dog")

    val movableObjects = listOf(rectangle, triangle, animal1, animal2)

    for (item in movableObjects)
        item.moveRight(10)
}

class Triangle(color: String, val a: Double, val b: Double, val c: Double): Figure(color){
    override fun area(): Double {
        val p=(a+b+c)/2
        return sqrt(p*(p-a)*(p-b)*(p-c))
    }

    override fun length(): Double {
        return a+b+c
    }
}

class Rectangle(color: String, val width: Double, val height: Double) : Figure(color) {
    override fun area(): Double {
        return width * height
    }

    override fun length(): Double {
        return 2 * (width + height)
    }

    fun isSquare(): Boolean {
        return width == height
    }
}