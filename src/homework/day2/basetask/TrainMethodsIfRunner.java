package homework.day2.basetask;

public class TrainMethodsIfRunner {
    public static void main(String[] args) {
        var instTrainMethodsIf = new TrainMethodsIf();
        System.out.println("метод returnNewInt вернул " + instTrainMethodsIf.returnNewInt(12));
        System.out.println("метод returnNewLong вернул " + instTrainMethodsIf.returnNewLong(2023));
        System.out.println("метод returnNewChar вернул " + instTrainMethodsIf.returnNewChar('f'));
        System.out.println("метод returnNewFloat вернул " + instTrainMethodsIf.returnNewFloat(0.68f));
        System.out.println("метод returnNewDouble вернул " + instTrainMethodsIf.returnNewDouble(851.5));
        System.out.println("метод returnNewBoolean вернул " + instTrainMethodsIf.returnNewBoolean(false));
    }
}
