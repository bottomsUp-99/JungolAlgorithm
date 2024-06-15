import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class jungol9020 {
    public static void main(String[] args) throws IOException {
        System.out.printf("5개의 수을 입력하시오.");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        sb.append(a + 3).append(" ").append(b - 3).append(" ").append(c * 3).append(" ").append(d / 3).append(" ").append(e % 3);
        System.out.println(sb);
    }
}
