import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class jungol9028 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());// int 변수 a 선언 및 초기화

        System.out.printf("%d / %d = %d\n", a, 4, a / (int)4);
        System.out.printf("%d / %.1f = %.2f", a, 4.0, a / (float)4);// 결과값 출력
    }
}
