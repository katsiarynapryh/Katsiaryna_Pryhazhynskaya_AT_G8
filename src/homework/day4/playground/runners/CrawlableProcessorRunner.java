package homework.day4.playground.runners;

import homework.day4.playground.creatures.*;
import homework.day4.playground.processors.CrawlableProcessor;
import homework.day4.playground.processors.FlyableProcessor;

public class CrawlableProcessorRunner {
    public static void main(String[] args) {
        CrawlableProcessor crawlableProc = new CrawlableProcessor();

        Crawlable crawlableCrocodile = new Crocodile(1723, "Neel Crawlable");
        Crawlable crawlableBeetle = new Beetle(43, "Christmas Crawlable");
        Vertebrata vertebrataCrocodile = new Crocodile(1723, "Neel Vertebrata");
        Insect insectBeetle = new Beetle(43, "Christmas Insect");
        Crocodile aCrocodile = new Crocodile(1723, "Neel Crocodile");
        Beetle aBeetle = new Beetle(43, "Christmas Beetle");
        Crawlable anonymousCrawlable = new Crawlable() {
            String name = "Anonymous";
            @Override
            public void crawl(String direction, int distance) {
                System.out.printf("I am %s, my name is %s and I am crawling to %s for %d units%n",
                        this.getClass().getSimpleName(), name, direction, distance);
            }
        };

        crawlableProc.runCrawlable(crawlableCrocodile);
        crawlableProc.runCrawlable(crawlableBeetle);
        // crawlableProc.runCrawlable(vertebrataCrocodile);
        // crawlableProc.runCrawlable(insectBeetle);
        crawlableProc.runCrawlable(aCrocodile);
        crawlableProc.runCrawlable(aBeetle);
        crawlableProc.runCrawlable(anonymousCrawlable);
        System.out.println();

        crawlableProc.runCrawlable(crawlableCrocodile, "никуда");
        crawlableProc.runCrawlable(aBeetle, "налево");
        System.out.println();

        crawlableProc.runCrawlable(crawlableBeetle, "назад", 37);
        System.out.println();

        crawlableProc.runCrawlable(anonymousCrawlable, "вниз", 37);

    }
}
