import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class jungol523 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        boolean result = (a > b);
        System.out.printf("%d > %d --- %s\n", a, b, result);
        result = (a < b);
        System.out.printf("%d < %d --- %s\n", a, b, result);
        result = (a >= b);
        System.out.printf("%d >= %d --- %s\n", a, b, result);
        result = (a <= b);
        System.out.printf("%d <= %d --- %s", a, b, result);
    }
}
