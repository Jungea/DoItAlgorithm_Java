package chap01;

public class Max3 {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        System.out.println("최대값 = " + solution(a, b, c));
    }

    private static int solution(int a, int b, int c) {
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
