fun comissiya(tip: String = "VK Pay", sumpred:Double=0.0, sum: Double): Double {
    val minkomVisaMir = 35.0
    val comVisaMir = 0.0075 * sum
    return when (tip) {
        "MasterCard", "Maestro" -> {
            if (sumpred >= 70000) {
                0.006 * sum + 20
            }
            else 0.0
        }
        "Visa","Мир" -> {
            if (comVisaMir>=minkomVisaMir) {
                0.0075 * sum
            }
            else minkomVisaMir
        }
        "VK Pay" -> 0.0
        else -> {
            0.006 * sum + 20
        }
    }
}
fun main(args: Array<String>) {
    println("Комиссия: ")
    print(comissiya("Мир",0.0,897.0))
}