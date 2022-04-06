/*
Есть классы:
class Address(val address: String, val city: String)
class Company(val name: String, val address: Address?)
class Employee(val name: String, val company: Company?)

Напишите функцию fun employeeCity(employee: Employee): String, которая возвращает название города,
в которой располагается организация, в которой работает данный человек.
В случае если он нигде не работает (в company лежит null), функция должна выводить: «Неизвестен»
Используйте функции безопасного вызова и оператор элвис

Для этой задачи есть видео с разбором.
*/

fun employeeCity(employee: Employee): String{
    val result = employee.company?.address?.city ?: "Неизвестен"
    return result
}

fun main() {
    val address = Address("ul. Gorkogo, 16", "Moscow")
    val company = Company("Noname", address)
    val employee = Employee("Kirill", company)

    println(employeeCity(employee))
}

class Address(val address: String, val city: String)
class Company(val name: String, val address: Address?)
class Employee(val name: String, val company: Company?)

