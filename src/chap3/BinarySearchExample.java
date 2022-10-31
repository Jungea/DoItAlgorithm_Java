package chap3;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchExample {

    public static void main(String[] args) {

        /*Scanner scan = new Scanner(System.in);

        System.out.print("요소수: ");
        int num = scan.nextInt();

        System.out.println("오름차순으로 입력하세요");

        int[] x = new int[num];

        System.out.print("x[0]: ");
        x[0] = scan.nextInt();

        for (int i = 1; i < num; i++) {
            do {
                System.out.printf("x[%d]: ", i);
                x[i] = scan.nextInt();
            } while (x[i - 1] < x[i]);
        }

        System.out.print("검색할 값: ");
        int key = scan.nextInt();*/

//        int index = lab3_4(x, num, key);
//        int index = hw3_4(new int[]{1,2,3,5,6,8,9,}, 7, 2);
//        int index = hw3_5(new int[]{1,3,5,7,7,7,7,8,8,9,9}, 10, 7);

        int index = Arrays.binarySearch(new int[] {1,2,3,5,6,8,9,}, 7);

        // hw3_6
        if (index < 0)
            System.out.printf("그 값의 요소가 %d에 있어야합니다.", (index+1)*-1);
        else
            System.out.printf("그 값은 %d에 있습니다.", index);
    }

    private static int lab3_4(int[] x, int num, int key) {
        int pl = 0;
        int pr = num - 1;
        int pc;

        do {
            pc = (pl + pr) / 2;

            if (x[pc] == key)
                return pc;

            else if (x[pc] < key)
                pl = pc + 1;
            else
                pr = pc - 1;

        } while (pl <= pr);


        return -1;
    }

    private static int hw3_4(int[] a, int num, int key) {
        int pl = 0;
        int pr = num-1;
        int pc;

        StringBuilder result = new StringBuilder("   |");
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < num; i++) {
            result.append("  " + i);
            sb2.append("  " + a[i]);
        }

        result.append("\n");
        result.append("---+" + "---".repeat(num + 1) + "\n");

        do {
            pc = (pl + pr) / 2;

            if (a[pc] == key)
                return pc;

            else if (a[pc] < key)
                pl = pc + 1;
            else
                pr = pc - 1;

        } while (pl <= pr);

        return -1;

    }

    private static int hw3_5(int[] a, int n, int key) {
        int pl = 0;
        int pr = n - 1;
        int pc;

        int result = n;

        do {
            pc = (pl + pr) / 2;

            if (a[pc] == key) {
                result = pc < result ? pc : result;
            }

            if (a[pc] < key)
                pl = pc + 1;
            else
                pr = pc - 1;

        } while (pl <= pr);


        return result==n?-1:result;
    }
}
