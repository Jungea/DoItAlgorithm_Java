package chap3;

import java.util.Scanner;

public class BinarySearchExample {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

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
        int key = scan.nextInt();

        int index = lab3_4(x, num, key);

        if (index == -1)
            System.out.println("그 값의 요소가 없습니다.");
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
}
