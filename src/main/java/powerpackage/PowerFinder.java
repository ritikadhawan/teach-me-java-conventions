package powerpackage;

public class PowerFinder {
    public static int pwr(int num1, int num2) {
        int p = 1;
        for (int i = 0; i < num2; i++) {
            p *= num1;
        }
        return p;
    }
}
