package homework.day4.playground.creatures;

public abstract class Vertebrata extends Animal {
    public Vertebrata(int mass, String animalName) {
        super(mass, animalName);
    }
    public void eat(Insect food) {
        var who = animalName;
        var what = food.animalName;
        System.out.println(String.format("I am %s and I am eating %s", who, what));
    }
}