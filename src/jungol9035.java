import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class jungol9035 {
    public static void main(String[] args) throws IOException {
        System.out.printf("세 수를 입력하세요. ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int ans = Math.max(a, b);
        ans = Math.max(ans, c);
        System.out.println("입력받은 수 중 가장 큰 수는 " + ans + "입니다.");
    }
}
