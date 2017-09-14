package utility;

public class TheFibonachy {

    public String getResult(int n) {
        if (n <= 0) return "n must be greater than 0";
        else if (n == 1) return "0";
        else {
            long first = 0, last = 1, t;
            String res = first + "\n" + last;
            n -= 2;
            for (int i = 0; i < n; i++) {
                t = first;
                first = last;
                last = t + first;
                res += "\n" + last;
            }
            return res;
        }
    }

}
