package homework.day4.playground.processors;

import homework.day4.playground.creatures.Crawlable;

import static homework.day4.playground.utils.DirectionGenerator.generateDirection;
import static homework.day4.playground.utils.DistanceGenerator.generateDistance;

public class CrawlableProcessor {
    public void runCrawlable(Crawlable crawlable) {
        crawlable.crawl(generateDirection(), generateDistance());
    }

    public void runCrawlable(Crawlable crawlable, String direction) {
        crawlable.crawl(direction, generateDistance());
    }

    public void runCrawlable(Crawlable crawlable, String direction, int distance) {
        crawlable.crawl(direction, distance);
    }
}
