/*
Переделайте функцию findEmployeeBySalary  из задачи по null safety таким образом, чтобы ее возвращаемый тип
был SomeEmployee,а не SomeEmployee?.
А в случае если подходящий сотрудник не найден, выбрасывайте исключительную ситуацию.
Вызовите эту функцию из main, обернув ее в try catch, обработав эту исключительную ситуацию в функции main.

p.s. здесь речь не идет о том, что такой вариант в данном случае предпочтительнее, чем использование null.
Рассматривайте это просто как практику работы с Exceptions

Для этой задачи есть видео с разбором.
*/

fun findEmployeeBySalary(employees: List<SomeEmployee>, salary: Int): SomeEmployee {
    for (employee in employees)
        if (employee.salary == salary)
            return employee

    throw Exception("Сотрудник с зарплатой $salary не найден")
}

fun main() {
    val employee1 = SomeEmployee("Kirill", 128000)
    val employee2 = SomeEmployee("Olga", 270000)
    val employee3 = SomeEmployee("Oleg", 150000)

    val employees = listOf(employee1, employee2, employee3)
    try {
        val result = findEmployeeBySalary(employees, 170000)
    }catch (e: Exception){
        println(e.message)
    }
}

class SomeEmployee(
        val name: String,
        val salary: Int
) {

    fun callToClient(clientName: String) {
        println("Сотрудник ${name}: звоню клиенту $clientName")
    }
}