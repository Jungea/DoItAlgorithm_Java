package chap01;

import java.io.*;

public class InputWhile {

    public static void main(String[] args) throws IOException {
//        doWhile();
//        while2();
        inputLength();
    }

    /**
     * 입력 자리수
     *
     * @throws IOException
     */
    private static void inputLength() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        writer.write("a = ");
        writer.flush();
        String a = reader.readLine();

        writer.write("그 수는 " + a.length() + "자리입니다.");
        writer.flush();

        writer.close();
    }

    /**
     * a보다 큰 숫자 입력
     *
     * @throws IOException
     */
    private static void while2() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int a, b;

        writer.write("a = ");
        writer.flush();
        a = Integer.parseInt(reader.readLine());

        while (true) {
            writer.write("b = ");
            writer.flush();
            b = Integer.parseInt(reader.readLine());

            if (b > a) break;
            writer.write("a보다 큰 값을 입력하세요! \n");
            writer.flush();
        }

        writer.write(String.valueOf(b - a));
        writer.flush();

        writer.close();
    }

    /**
     * 양수만 입력
     *
     * @throws IOException
     */
    private static void doWhile() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int n;

        do {
            writer.write("n = ");
            writer.flush();
            n = Integer.parseInt(reader.readLine());
        } while (n <= 0);

        writer.write(String.valueOf(n));
        writer.flush();

        writer.close();
    }
}
