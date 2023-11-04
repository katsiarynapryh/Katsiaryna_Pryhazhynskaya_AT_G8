package homework.day4.playground.creatures;

import homework.day4.playground.craft.field.Motorbike;

public class Crocodile extends Vertebrata implements Crawlable {
    public Crocodile(int mass, String animalName) {
        super(mass, animalName);
    }

    @Override
    public void crawl(String direction, int distance) {
        System.out.println(String.format("I am %s, my name is %s and I am crawling to %s for %d units",
                Crocodile.class.getSimpleName(), this.getName(), direction, distance));
        //N - название класса соответствующего обьекта,
        // М - значение name обьекта,
        // D и F - значения передаваемых аргументов,
        //
        // при этом после проползания крокодил издает в консоль "wr-wr-wrr-r..", а жук "vz-vz-vzz-zz.."
        System.out.println("wr-wr-wrr-r..");
    }
}
