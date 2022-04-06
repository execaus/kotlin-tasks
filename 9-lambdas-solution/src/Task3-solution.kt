/*
Написать функцию, которая возвращает количество элементов, удовлетворяющих условию:
fun elementsCount(users: List<User>, condition: (User) -> Boolean): Int

Дата класс User уже описан в отдельном файле в этом разделе и доступен здесь.

Проверить работу написанной функции на примере каких-нибудь входных данных.

Для этой задачи есть видео с разбором.
*/

fun elementsCount(users: List<User>, condition: (User) -> Boolean): Int{
    var counter = 0

    for(user in users)
        if(condition(user) == true)
            counter++

    return counter
}

fun main() {
    val users = listOf(
            User("Kirill", 45),
            User("Olga", 32),
            User("Marina", 12)
    )


    val result = elementsCount(users){it.name.length>5}

    println(result)
}
