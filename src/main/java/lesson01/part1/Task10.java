package lesson01.part1;

public class Task10 {

    /**
     * Не думать о секундах…
     * Напиши код, который считает сколько секунд прошло с 15:00, если на часах 15:30. Выведи результат на экран.
     * <p>
     * <p>
     * Требования:
     * 1. Программа должна выводить текст.
     * 2. Выведенный текст должен быть целым положительным числом.
     * 3. Выведенное число должно быть кратно 60.
     * 4. Выводимое число должно соответствовать заданию.
     */

    public static void main(String[] args) {
        function checkTime (beg, end)
        {
            var s = 60,
                    d = ':',
                    b = beg.split (d), b = b [0]* s * s + b [1] * s + +b [2],
                    e = end.split (d), e = e [0]* s * s + e [1] * s + +e [2],
                    t = new Date, t = t.getHours () * s * s + t.getMinutes () * s + t.getSeconds ();
            return (t >= b && t <= e);
        }

        var rez = checkTime ('15:00:00', '15:30:00');
        alert (rez);
    }
}
