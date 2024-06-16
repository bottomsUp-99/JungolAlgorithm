import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class jungol147 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = i; k <= n; k++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}