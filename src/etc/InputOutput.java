package etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class InputOutput {

    public static void main(String[] args) throws IOException {
        scannerSout();
        buffer();
    }

    /**
     * 사용 추천
     * @throws IOException
     */
    private static void buffer() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);  // 공백 처리 == .split(" ")
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("hello\n");
        bw.write(String.valueOf(a + b));  // 문자열로 변환

        bw.flush();  // 새로 입력받으로면 호출 필요
        bw.close();
    }

    private static void scannerSout() {
        Scanner scan = new Scanner(System.in);
        int scanInt = scan.nextInt();  // 띄어쓰기
        String scanString = scan.next();  // 띄어쓰기
        String scanString2 = scan.nextLine();  // 줄바꿈

        System.out.println("숫자 = " + scanInt + ", 문자열 = " + scanString);
    }


}
