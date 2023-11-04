package homework.day4.playground.creatures;

public class Beetle extends Insect implements Crawlable {
    public Beetle(int mass, String animalName)
    {
        super(mass, animalName);
    }

    public void nest(Carrot home) {
        var who = animalName; // имя соответствующего обьекта класса жука
//
//        var what = int x; // целая чать от деления массы моркови на массу жука
//        int x = home.getMass() / this.mass;
//        int x % 2 == 0 // целая чать от деления массы моркови на массу жука

        if (this.mass < home.getMass())
        {
            System.out.println(String.format("I am %s and I will nest there with %s my family members!", who));
        } else
        {
            System.out.println("This carrot is too small for nesting :(");
        }
    }

    @Override
    public void crawl(String direction, int distance) {
        System.out.println(String.format("I am %s, my name is %s and I am crawling to %s for %d units",
                Beetle.class.getSimpleName(), this.getName(), direction, distance));
        System.out.println("vz-vz-vzz-zz..");
    }
}