public class updateBit {
    public static int clearithBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static int setithBit(int n, int i) {
        int bitmask = 1 << i;
        return n | bitmask;
    }

    public static int updateithBit(int n, int i, int newBit) {
        if (newBit == 0) {
            return clearithBit(n, i);
        } else {
            return setithBit(n, i);
        }
        // advance process
        // n = clearithBit(n, i);
        // int bitMask = newBit << i;
        // return n | bitMask;
    }

    public static void main(String[] args) {
        System.out.println(updateithBit(10, 02, 01));
    }
}
