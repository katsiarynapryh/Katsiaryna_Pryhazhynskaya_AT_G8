package basetask;

public class TrainMethodsReturnRunner {
    public static void main(String[] args) {
        var instTrainMethodsReturn = new TrainMethodsReturn();
        System.out.println("метод returnNewInt вернул " + instTrainMethodsReturn.returnNewInt(5));
        System.out.println("метод returnNewLong вернул " + instTrainMethodsReturn.returnNewLong(12));
        System.out.println("метод returnNewChar вернул " + instTrainMethodsReturn.returnNewChar('@'));
        System.out.println("метод returnNewFloat вернул " + instTrainMethodsReturn.returnNewFloat(12.6f));
        System.out.println("метод returnNewDouble вернул " + instTrainMethodsReturn.returnNewDouble(2.2));
        System.out.println("метод returnNewShort вернул " + instTrainMethodsReturn.returnNewShort((short) 38));
        System.out.println("метод returnNewByte вернул " + instTrainMethodsReturn.returnNewByte((byte) 3));
        System.out.println("метод returnNewBoolean вернул " + instTrainMethodsReturn.returnNewBoolean(false));
    }
}