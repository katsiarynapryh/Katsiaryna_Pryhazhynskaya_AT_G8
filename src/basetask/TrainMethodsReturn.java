package basetask;

public class TrainMethodsReturn {
    public int returnNewInt(int a) {
        return a * 3;
    }

    public long returnNewLong(long a) {
        return a - 4;
    }

    public String returnNewChar(char b) {
        return "" + b + b;
    }

    public float returnNewFloat(float c) {
        return c / 2;
    }

    public double returnNewDouble(double d) {
        return d + 8;
    }

    public short returnNewShort(short e) {
        return (short) (e - 1);
    }

    public byte returnNewByte(byte b) {
        return (byte) (b * 2);
    }

    public boolean returnNewBoolean(boolean y) {
        return !y;
    }
}
