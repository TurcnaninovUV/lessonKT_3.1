fun main() {
    val time = 5000
    agoToText(time)
}

fun agoToText(time: Int) {
    val timeName = if (time <= 3600) transferMinute(time)
    else transferHours(time)
    when {
        (time in 0..60) -> println("был(а) только что")
        (time in 61..(60 * 60)) -> println("был(а) в сети ${time / 60} $timeName назад")
        (time in (60 * 60 + 1)..(24 * 60 * 60)) -> println("был(а) в сети ${time / 3600} $timeName назад")
        (time in (24 * 60 * 60 + 1)..((24 * 60 * 60) * 2)) -> println("был(а) в сети сегодня")
        (time in ((24 * 60 * 60 + 1) * 2)..((24 * 60 * 60) * 3)) -> println("был(а) в сети вчера")
        else -> println("был(а) в сети давно")
    }
}

fun transferMinute(time: Int): String {
    val minutes = time / 60
    return if (minutes % 10 == 2 || minutes in (2..4) || minutes % 10 == 3 || minutes % 10 == 4  ) "минуты"
    else if (minutes % 10 == 1 && minutes != 11) "минуту"
    else "минут"
}

fun transferHours(time: Int): String {
    return when (time / 3600) {
        1, 21 -> "час"
        2, 3, 4, 22, 23, 24 -> "часа"
        else -> "часов"
    }
}







