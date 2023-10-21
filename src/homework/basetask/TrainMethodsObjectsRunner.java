package homework.basetask;

public class TrainMethodsObjectsRunner {
    public static void main(String[] args) {
        TrainMethodsObjects runner = new TrainMethodsObjects();

        runner.processMouse(new Mouse("Jerry", 7));
        runner.processSouce(new Souce("чесночный", "белого"));
        runner.processBee(new Bee("female", 3));
        runner.processObstacle(new Obstacle("сделать дз", "срочно"));
        runner.processPineapple(new Pineapple("рислинг", 2.07));
    }
}