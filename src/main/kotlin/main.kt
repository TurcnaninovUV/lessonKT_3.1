fun main() {
    val time = 8000
    agoToText2(time)?.let { agoToText(time, it) }
}

fun agoToText(time: Int, timeName: String) =
    when {
        (time in 0..60) -> println("был(а) только что")
        (time in 61..(60 * 60)) -> println("был(а) в сети ${time / 60} $timeName назад")
        (time in (60 * 60 + 1)..(24 * 60 * 60)) -> println("был(а) в сети ${time / 3600} $timeName назад")
        (time in (24 * 60 * 60 + 1)..((24 * 60 * 60) * 2)) -> println("был(а) в сети ${time / 86400} сегодня")
        (time in ((24 * 60 * 60 + 1) * 2)..((24 * 60 * 60) * 3)) -> println("был(а) в сети вчера")
        else -> println("был(а) в сети давно")
    }

fun agoToText2(time: Int): String? {
    var minutes = time / 60
    var timeName: String? = null
    if (minutes < 60) {
        timeName = if (minutes in (5..20) || minutes in (25..30) ||
            minutes in (35..40) || minutes in (45..50) || minutes in (55..60)
        ) "минут"
        else if (minutes == 1 || minutes == 21 || minutes == 31 || minutes == 41 || minutes == 51) "минуту"
        else "минуты"
    } else if (minutes > 60) {
        minutes /= 60
        timeName = when (minutes) {
            1, 21 -> "час"
            2, 3, 4, 22, 23, 24 -> "часа"
            else -> "часов"
        }
    }
    return timeName
}






