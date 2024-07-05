package chap01;

public class Median {

    public static void main(String[] args) {
        System.out.println(med3(1, 2, 3));
    }

    /**
     * 중간값 계산
     * @param a
     * @param b
     * @param c
     * @return
     */
    private static int med3(int a, int b, int c) {

        if (a > b) {
            if (b > c) { // abc
                return b;
            } else if (c > a) {  // cab
                return a;
            } else {  // acb
                return c;
            }

        // ba
        } else if (a > c) {  // bac
            return a;
        } else if (c > b) { // cba
            return b;
        } else {  // bca
            return c;
        }
    }
}
