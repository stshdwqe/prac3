fun main(args: Array<String>) {
    println(agoToText(63))
}
fun minutesAgoToText(min: Int): String {
    return when {
        min in 2..4 || min in 22..24 || min in 32..34 || min in 42..44 || min in 52..54 -> "был(а) в сети $min минуты назад"
        min == 1 || min % 10 == 1 -> "был(а) в сети $min минуту назад"
        else -> "был(а) в сети $min минут назад"
    }
}
fun hoursAgoToText(hours: Int): String {
    return when {
        hours == 1 || hours % 10 == 1 -> "был(а) в сети $hours час назад"
        hours in 2..4 || hours in 22..24 -> "был(а) в сети $hours часа назад"
        else -> "был(а) в сети $hours часов назад"
    }

}
fun agoToText(sec: Int ): String{
    return when {
        sec in 0..60 -> "был(а) только что"
        sec in 61..3600 -> minutesAgoToText(sec / 60)
        sec in 3601..86400 -> hoursAgoToText(sec / 3600)
        sec in 86401..172800 -> "был(а) в сети вчера"
        sec in 172801..259200 -> "был(а) в сети позавчера"
        else -> "был(а) в сети давно"
    }
}


