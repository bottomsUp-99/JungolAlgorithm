import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class jungol527 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()); // int 변수 a 선언 및 초기화
        int b = Integer.parseInt(st.nextToken()); // int 변수 b 선언 및 초기화

        int result1 = (a / b); //첫 번째 수를 두 번째 수로 나눈 몫
        double result2 = (double) a / b; //첫 번째 수를 실수로 변환하여 두 번째 수로 나눈 값

        System.out.printf("%d %.2f", result1, result2); //결과값 출력
    }
}
