package chap01;

public class Max3 {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        System.out.println("최대값 = " + max3(a, b, c));
        System.out.println("최대값 = " + max4(a, b, c, 4));
        System.out.println("최소값 = " + min3(a, b, c));
        System.out.println("최소값 = " + min4(a, b, c, 4));
    }

    /**
     * 네 값의 최소값 구하는 메소드
     * @param a
     * @param b
     * @param c
     * @param d
     * @return
     */
    private static int min4(int a, int b, int c, int d) {
        int min = a;

        if (min > b) {
            min = b;
        }

        if (min > c) {
            min = c;
        }

        if (min > d) {
            min = d;
        }

        return min;
    }

    /**
     * 세 값의 최소값 구하는 메소드
     *
     * @param a
     * @param b
     * @param c
     * @return
     */
    private static int min3(int a, int b, int c) {
        int min = a;

        if (min > b) {
            min = b;
        }

        if (min > c) {
            min = c;
        }

        return min;
    }

    /**
     * 네 값의 최대값 구하는 메소드
     *
     * @param a
     * @param b
     * @param c
     * @param d
     * @return
     */
    private static int max4(int a, int b, int c, int d) {
        int max = a;

        if (max < b) {
            max = b;
        }

        if (max < c) {
            max = c;
        }

        if (max < d) {
            max = d;
        }

        return max;
    }

    /**
     * 세 값의 최대값 구하는 메소드
     *
     * @param a
     * @param b
     * @param c
     * @return
     */
    private static int max3(int a, int b, int c) {
        int max = a;

        if (max < b) {
            max = b;
        }

        if (max < c) {
            max = c;
        }

        return max;
    }

}
