/*
Те же требования каршеренга, что и в задаче 5.
Общие требования:
•	Возраст не меньше 21 года.
•	Водительский стаж категории «В» от двух лет.
Дополнительные требования для доступа к автомобилям Audi, BMW:
•	Возраст не меньше 26 лет.
•	Водительский стаж категории «В» от шести лет. 

Написать функцию, принимающую на вход марку авто(String), возраст и стаж пользователя и возвращающую 
Boolean (доступно ему это авто или нет)

Проверить работу написанной функции на примере каких-нибудь входных данных.
*/

//функция - это основа этого задания
fun carAvailable(age: Int, experience: Int, brand: String): Boolean {
    val carAvailable = when {
        age >= 26 && experience >= 6 -> true
        age >= 21 && experience >= 2 && brand != "Audi" && brand != "BMW" -> true
        else -> false
    }
    return carAvailable
}

//проверка работы функции
fun main() {
    val age: Int = 28
    val experience: Int = 9
    val brand: String = "BMW"

    val carAvailable = carAvailable(age, experience, brand)

    println(carAvailable)
}