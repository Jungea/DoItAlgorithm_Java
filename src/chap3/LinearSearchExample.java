package chap3;

import java.util.Scanner;

public class LinearSearchExample {
    public static void main(String[] args) {

//        mainInput1();
        mainInput2();

    }

    private static void mainInput1() {
        Scanner scan = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = scan.nextInt();

        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.printf("x[%d]: ", i);
            arr[i] = scan.nextInt();
        }

        System.out.print("검색할 값: ");
        int key = scan.nextInt();

        int index = lab3_1(arr, num, key);

        if (index == -1)
            System.out.println("그 값의 요소가 없습니다.");
        else
            System.out.printf("그 값은 x[%d]에 있습니다.", index);

    }

    /**
     * 보초법
     */
    private static void mainInput2() {
        Scanner scan = new Scanner(System.in);

        /*System.out.print("요솟수: ");
        int num = scan.nextInt();

        int[] arr = new int[num + 1];
        for (int i = 0; i < num; i++) {
            System.out.printf("x[%d]: ", i);
            arr[i] = scan.nextInt();
        }

        System.out.print("검색할 값: ");
        int key = scan.nextInt();*/

//        int index = lab3_3(arr, num, key);
        int index = hw3_1(new int[] {6,4,3,2,1,9,8,}, 7, 3);

        if (index == -1)
            System.out.println("그 값의 요소가 없습니다.");
        else
            System.out.printf("그 값은 x[%d]에 있습니다.", index);

    }


    private static int lab3_2(int[] arr, int num, int key) {
        for (int i = 0; i < num; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }


    private static int lab3_1(int[] arr, int num, int key) {
        int index = 0;

        while (true) {
            if (index >= num)
                return -1;

            if (arr[index] == key)
                return index;

            index++;
        }
    }

    private static int lab3_3(int[] arr, int num, int key) {
        int index = 0;
        arr[num] = key; // 보초

        while (true) {
            if (arr[index] == key)
                break;

            index++;
        }

        return index == num? -1: index;
    }

    private static int hw3_1(int[] arr, int num, int key) {
        int index = 0;
        arr[num] = key; // 보초

        for(; ; index++) {
            if (arr[index] == key)
                break;
        }

        return index == num? -1: index;
    }


}

