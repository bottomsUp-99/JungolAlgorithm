import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class jungol9061 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 1;
        for(int i = 1 ; i <= n ; i++) {
            for(int j = 0 ; j < i ; j++) {
                System.out.print(cnt + " ");
                cnt++;
            }
            System.out.println();
        }
    }
}
