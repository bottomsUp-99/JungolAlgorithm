import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class jungol526 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        float a= Float.parseFloat(st.nextToken()); //float 변수 a 선언 및 초기화
        float b= Float.parseFloat(st.nextToken()); //float 변수 b 선언 및 초기화

        System.out.printf("%d %d", (int)(a * b), (int)a * (int)b); //결과값 출력
    }
}
