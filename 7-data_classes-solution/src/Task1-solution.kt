/*
Опишите дата классы для хранения информации из задания 5 по функциям. 
Для пользователя (User) должно храниться имя, возраст, стаж. Для автомобиля (Car): бренд, цена аренды

Переделайте функции из задач 5 и 6 из раздела "функции" на работу с этими дата-классами.
Т.е. функции должны принимать не возраст, стаж и бренд авто, а объекты классов User и Car
(функции пишите в этом файле заново)

Поля «имя» в классе User и «цена аренды» в классе Car никак не будут использоваться в тех функциях, которые вы напишите.
Это нормально. Не обязательно вся информация всегда нужна.

Проверьте работу написанных функций на примере каких-нибудь входных данных.
*/

data class Car(val brand: String, val model: String, val cost: Double)
data class User(val name: String, val age: Int, val experience: Int)

fun userStatus(user: User): String {
    val userStatus = when {
        user.age >= 26 && user.experience >= 6 -> "Доступны все авто"
        user.age >= 21 && user.experience >= 2 -> "Доступны все авто кроме Audi и BMW"
        else -> "Услуги каршеринга недоступны"
    }
    return userStatus
}

fun carAvailable(user: User, car: Car): Boolean {
    val carAvailable = when {
        user.age >= 26 && user.experience >= 6 -> true
        user.age >= 21 && user.experience >= 2 && car.brand != "Audi" && car.brand != "BMW" -> true
        else -> false
    }
    return carAvailable
}

fun main() {
    val user = User("Kirill", 28, 9)
    val car = Car("BMW", "x5", 15.3)

    val status = userStatus(user)
    println(status)

    val carAvailable = carAvailable(user, car)
    println(carAvailable)
}