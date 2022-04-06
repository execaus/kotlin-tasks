/*
Даны классы
Отдел: data class Department(val name: String, val employees: List<Employee>)
Сотрудник: data class Employee(val name: String, val age: Int)
Эти классы уже описаны в отдельных файлах в этом разделе и доступны здесь.

Написать функцию, которая на вход принимает объект класса Department и возвращает средний возраст сотрудников этого отдела
Проверить работу написанной функции на примере каких-нибудь входных данных.
*/

fun averageAgeOfEmployeesInDepartment(department: Department): Int {
    var sumOfAge = 0

    for (employee in department.employees)
        sumOfAge += employee.age

    return sumOfAge / department.employees.size
}

fun main() {
    val employee1 = Employee("Kirill", 23)
    val employee2 = Employee("Olga", 28)
    val employee3 = Employee("Ivan", 29)
    val employee4 = Employee("Oleg", 35)

    val employees = listOf(employee1, employee2, employee3, employee4)
    val department = Department("IT", employees)

    val averageAge = averageAgeOfEmployeesInDepartment(department)

    println(averageAge)
}
