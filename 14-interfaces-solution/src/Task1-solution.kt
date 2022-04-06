/*
Создайте интерфейс Movable (перемещаемый), в котором будут описаны функции moveLeft(step: Int), moveRight(step: Int),
moveDown(step: Int), moveUp(step: Int).

Сделайте так, чтобы класс Figure из предыдущего задания реализовывал интерфейс Movable (скопируйте сюда код написанного
вами класса Figure)

Для этой задачи есть видео с разбором.
*/

interface Movable {
    fun moveLeft(step: Int)
    fun moveRight(step: Int)
    fun moveDown(step: Int)
    fun moveUp(step: Int)
}

abstract class Figure(val color: String): Movable {
    var x: Int = 0
    var y: Int = 0

    abstract fun area(): Double

    abstract fun length(): Double

    override fun moveLeft(step: Int) {
        x -= step
    }

    override fun moveRight(step: Int) {
        x += step
    }

    override fun moveDown(step: Int) {
        y += step
    }

    override fun moveUp(step: Int) {
        y -= step
    }
}