/*
Дан класс, описывающий сотрудника:
data class Employee(val name: String, val age: Int)
Этот класс уже описан в отдельном файле в этом разделе и доступен здесь.

Написать функцию, которая принимает на вход список объектов класса User  и возвращает средний возраст всех пользователей.

Проверить работу написанной функции на примере каких-нибудь входных данных.
*/


//функция - это основа этого задания
fun averageAgeOfEmployees(employees: List<Employee>): Int{
    var sum = 0

    for(employee in employees)
        sum +=employee.age

    return sum/employees.size
}

//проверка работы функции
fun main() {
    val employee1 = Employee("Kirill", 23)
    val employee2 = Employee("Olga", 28)
    val employee3 = Employee("Ivan", 29)
    val employee4 = Employee("Oleg", 35)

    val employees = listOf(employee1, employee2, employee3, employee4)

    val averageAge = averageAgeOfEmployees(employees)

    println(averageAge)
}