package classwork.day6;

public class ObjectContainerRunner {
    public static void main(String[] args) {
        ObjectContainer testData = new ObjectContainer();
        testData.add(11);
        testData.add(22);
        testData.add(2023);
        testData.add(2024);
        while (!testData.isEmpty()){
            System.out.println(testData.removeLast());
        }
    }
}
