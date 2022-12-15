
public class MyCalc {

    /**
     * @param n1
     * @param n2
     * @return
     * @throws Exception
     */
    public int longPower(int n1, int n2) throws Exception {

        if (n1 < 0 || n2 < 0) {
            throw new Exception("java.lang.Exception: n or p should be negative");
        } else if (n1 == 0 && n2 == 0) {

            throw new Exception("java.lang.Exception: n and p should not be zero");
        } else {

            double result = Math.pow(n1, n2);
            return (int) result;

        }

    }

}
