/*
Дана следующая структура классов.
Компания: data class Company(val name: String, val departments: List<Department>)
Отдел: data class Department(val name: String, val employees: List<Employee>)
Сотрудник: data class Employee(val name: String, val age: Int)
Эти классы уже описаны в отдельных файлах в этом разделе и доступны здесь.

Написать функции для подсчета общего количества человек, работающих в заданной компании и их среднего возраста:
fun totalNumberOfEmployees(company: Company): Int
fun averageAgeOfEmployees(company: Company): Int

Для этой задачи есть видео с разбором.
*/

fun totalNumberOfEmployees(company: Company): Int{
    var counter = 0

    for(department in company.departments)
        counter += department.employees.size

    return counter
}

fun averageAgeOfEmployees(company: Company): Int{
    var counter = 0
    var sumOfAge = 0

    for(department in company.departments)
        for(employee in department.employees) {
            counter++
            sumOfAge += employee.age
        }

    return sumOfAge/counter
}


fun main() {
    val employee1 = Employee("Kirill", 23)
    val employee2 = Employee("Olga", 28)
    val employee3 = Employee("Ivan", 29)
    val employee4 = Employee("Oleg", 35)
    val employee5 = Employee("Roman", 26)
    val employee6 = Employee("Nikolay", 28)
    val employee7 = Employee("Marina", 34)

    val department1 = Department("IT", listOf(employee1, employee2, employee3))
    val department2 = Department("HR", listOf(employee4))
    val department3 = Department("Finance", listOf(employee5, employee6, employee7))
    val company = Company("NoName", listOf(department1, department2, department3))

    println(totalNumberOfEmployees(company))

    println(averageAgeOfEmployees(company))
}