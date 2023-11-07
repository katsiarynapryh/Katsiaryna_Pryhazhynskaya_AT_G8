package homework.day5;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CurrentDate
{
    //1.5 метод выводит в консоль текущую дату и время в формате:
    //Сейчас на дворе: 19 сентября, 2020, 3 часа 13 минут

long now = System.currentTimeMillis();
    public void currentDate() {
        LocalTime now = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("DD MMMM, YYYY, HH MM");
        String dateTimeString = now.format(formatter);
        System.out.println("Сейчас на дворе: " + now);
    }
}
