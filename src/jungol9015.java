import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class jungol9015 {
    public static void main(String[] args) throws IOException {
        System.out.printf("두 수를 입력하시오. ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        System.out.printf("%d + %d = %d\n", a, b, a + b);
        System.out.printf("%d * %d = %d", a, b, a * b);
    }
}