/*
Написать функцию, которая проверяет email на корректность. 
Корректным считается email если в нем присутствует символа @ и точка. 
Проверить наличие символа в строке можно с помощью функции contains следующим образом: string.contains(‘@’), 
где string – любая переменная типа String. Обратите внимание, что отдельные символы пишутся в одинарных кавычках, 
тогда как строка пишется в двойных.

На вход email: String, на выходе Boolean
Например:
Если есть val text: String = “Forest”, тогда text.contains(‘e’) выдаст true, а !text.contains(‘e’)  выдаст false

Проверить работу написанной функции на примере каких-нибудь входных данных.

Для этой задачи есть видео с разбором.
*/

//вариант 1
fun emailIsCorrect(email: String): Boolean{
    val result = if(email.contains('@') && email.contains('.'))
        true
    else
        false

    return result
}

//вариант 2 - более компактный. Но если он вам непонятен, то делайте пока как в варианте 1
/*fun emailIsCorrect(email: String): Boolean{
    val result = email.contains('@') && email.contains('.')

    return result
}*/

//проверка работы функции
fun main() {
    val email = "test@gmailcom"

    val result = emailIsCorrect(email)
    println(result)
}