/*
Создайте класс Animal с полями name: String, x: Int, y: Int, который будет реализовывать интерфейс Movable
из предыдущей задачи (любой вариант реализации на ваш выбор)

Для этой задачи есть видео с разбором.
*/

class Animal(val name: String): Movable{
    var x: Int = 0
    var y: Int = 0


    override fun moveLeft(step: Int) {
        x -= step
        println("Я передвинулось влево")
    }

    override fun moveRight(step: Int) {
        x += step
        println("Я передвинулось вправо")
    }

    override fun moveDown(step: Int) {
        y += step
        println("Я передвинулось вниз")
    }

    override fun moveUp(step: Int) {
        y -= step
        println("Я передвинулось вверх")
    }
}