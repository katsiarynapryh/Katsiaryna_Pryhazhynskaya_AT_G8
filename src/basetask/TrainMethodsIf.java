package basetask;

public class TrainMethodsIf {
    public int returnNewInt(int num) {
        if (num < 8) {
            return num * 7;
        } else {
            return num / 4;
        }
    }

    public long returnNewLong(long longNum) {
        if (longNum > 300) {
            return longNum - 300;
        } else {
            return longNum + 20;
        }
    }

    public String returnNewChar(char symbol) {
        if (symbol == 'g') {
            return "go";
        } else {
            return (String) "o" + symbol;
        }
    }

    public float returnNewFloat(float floatNum) {
        if (floatNum == 0.67f) {
            return floatNum;
        } else {
            return floatNum * 2;
        }
    }

    public double returnNewDouble(double doubleNum) {
        boolean isInRange1, isInRange2;
        isInRange1 = doubleNum > 30 && doubleNum < 80; // 30 < doubleNum < 80
        isInRange2 = doubleNum > 80 && doubleNum < 400; // 80 < doubleNum < 400
        if (isInRange1) {
            return doubleNum + 87;
        } else if (isInRange2) {
            return doubleNum - 87;
        } else if (doubleNum > 400) {
            return doubleNum / 4;
        } else {
            return doubleNum;
        }
    }

    public String returnNewBoolean(boolean y) {
        if (y == true) {
            return "Я получил на вход значение истины";
        } else {
            return "Я получил на вход ложь";
        }
    }
}
