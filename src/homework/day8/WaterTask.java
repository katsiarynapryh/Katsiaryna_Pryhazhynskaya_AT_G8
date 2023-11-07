package homework.day8;

import homework.day8.objectclasses.Bubble;
import homework.day8.objectclasses.Water;

import java.util.Arrays;
import java.util.List;

public class WaterTask {
    public static void main(String[] args) {
        List<Water> water = Arrays.asList(new Water("Прозрачная", "Нет"), new Water("Прозрачная", "Нет"), new Water("Мутная", "Аммиачный"));

        //Проитерировать список через for-each и отпечатать пары цвет-вода через тире в консоль с новой строки
        for (Water mywater : water) {
            System.out.println(mywater.getColor() + "-" + mywater.getSmell());
        }
    }
}