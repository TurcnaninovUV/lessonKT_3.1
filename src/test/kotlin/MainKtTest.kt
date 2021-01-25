import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun main_test() {
        val time = 5000
        val expected = println("был(а) в сети 1 час назад")

        val result = agoToText(time)

        assertEquals(expected, result)
    }


    @Test
    fun agoToText_timeNameIf() {
        val time = 1320
        val expected = println("был(а) в сети 22 минуты назад")

        val result = agoToText(time)

        assertEquals(expected, result)
    }

    @Test
    fun agoToText_timeNameElse() {
        val time = 3720
        val expected = println("был(а) в сети 1 час назад")

        val result = agoToText(time)

        assertEquals(expected, result)
    }

    @Test
    fun agoToText_whenMinutes() {
        val time = 240
        val expected = println("был(а) в сети 4 минуты назад")

        val result = agoToText(time)

        assertEquals(expected, result)
    }

    @Test
    fun agoToText_whenHours() {
        val time = 5000
        val expected = println("был(а) в сети 1 час назад")

        val result = agoToText(time)

        assertEquals(expected, result)
    }

    @Test
    fun agoToText_whenJust() {
        val time = 45
        val expected = println("был(а) только что")

        val result = agoToText(time)

        assertEquals(expected, result)
    }



    @Test
    fun agoToText_whenToday() {
        val time = 90000
        val expected = println("был(а) в сети сегодня")

        val result = agoToText(time)

        assertEquals(expected, result)
    }

    @Test
    fun agoToText_whenYesterday() {
        val time = 60
        val expected = println("был(а) в сети вчера")

        val result = agoToText(time)

        assertEquals(expected, result)
    }

    @Test
    fun agoToText_whenElse() {
        val time = 270000
        val expected = println("был(а) в сети давно")

        val result = agoToText(time)

        assertEquals(expected, result)
    }

    @Test
    fun transferMinute_firstIfOneOption() {
        val time = 139
        val expected = "минуты"

        val result = transferMinute(time)

        assertEquals(expected, result)
    }

    @Test
    fun transferMinute_returnMinutesElseIf() {
        val time = 1260
        val expected = "минуту"

        val result = transferMinute(time)

        assertEquals(expected, result)
    }

    @Test
    fun transferMinute_returnMinutesElse() {
        val time = 300
        val expected = "минут"

        val result = transferMinute(time)

        assertEquals(expected, result)
    }

    @Test
    fun transferHours_returnOneWhen() {
        val time = 3600
        val expected = "час"

        val result = transferHours(time)

        assertEquals(expected, result)
    }

    @Test
    fun transferHours_returnTwoWhen() {
        val time = 7200
        val expected = "часа"

        val result = transferHours(time)

        assertEquals(expected, result)
    }

    @Test
    fun transferHours_returnElse() {
        val time = 18000
        val expected = "часов"

        val result = transferHours(time)

        assertEquals(expected, result)
    }
}