package chap01;

public class SumValue {
    public static void main(String[] args) {
        System.out.println(sumWhile(5));
        System.out.println(sumFor(5));
        System.out.println(sumGauss(5));
        System.out.println(sumOf(6, 4));
    }

    private static int sumOf(int a, int b) {
        int min, max;

        if (a > b) {
            min = b;
            max = a;
        } else {
            min = a;
            max = b;
        }

        int sum = 0;
        for (int i = min; i <= max; i++) {
            sum += i;
        }

        return sum;
    }


    /**
     * 가우스 덧셈
     *
     * @param n
     * @return
     */
    private static int sumGauss(int n) {
        return (n + 1) * n / 2;
    }

    private static int sumFor(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }

    private static int sumWhile(int n) {
        int i = 1;
        int sum = 0;
        while (i <= n) {
            sum += i;
            i++;
        }

        return sum;
    }
}
