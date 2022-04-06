/*
1.	Есть класс:
    class SomeEmployee(
            val name: String,
            val salary: Int
    ) {

        fun callToClient(clientName: String) {
            println("Сотрудник ${name}: звоню клиенту $clientName")
        }
    }

Написать функцию
fun findEmployeeBySalary(employees: List<SomeEmployee>, age: Int): SomeEmployee?
которая ищет в списке сотрудников сотрудника с заданной зарплатой.
Сделайте так, чтобы функция возвращала null в случае если такого сотрудника в списке нет
Создать произвольный список сотрудников. Используя эту функцию найти в списке сотрудника с определенной зарплатой.
Вызвать у него функцию callToClient, используя безопасный вызов (?)
*/

fun findEmployeeBySalary(employees: List<SomeEmployee>, salary: Int): SomeEmployee? {
    for (employee in employees)
        if (employee.salary == salary)
            return employee

    return null
}

fun main() {

    val employee1 = SomeEmployee("Kirill", 18)
    val employee2 = SomeEmployee("Oleg", 21)
    val employee3 = SomeEmployee("Olga", 25)

    val employees = listOf(employee1, employee2, employee3)

    val employee = findEmployeeBySalary(employees, 21)

    employee?.callToClient("Ivan")
}

class SomeEmployee(
        val name: String,
        val salary: Int
) {

    fun callToClient(clientName: String) {
        println("Сотрудник ${name}: звоню клиенту $clientName")
    }
}