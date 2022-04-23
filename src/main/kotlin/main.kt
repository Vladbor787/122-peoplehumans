fun main() {
    var likes: Int
    while (true) {
        print("Введите количество лайков: ")
        try {
            likes = readLine()?.toInt()!!
            if (likes >= 0) printResult(likes) else println("Неверный ввод")
        } catch (e: NumberFormatException) {
            println("Некоректный ввод")
        }
    }
}

fun printResult(likes: Int) {
    if (likes % 10 == 1 && likes % 100 != 11) println("Понравилось $likes человеку")
    else println("Понравилось $likes людям")

}