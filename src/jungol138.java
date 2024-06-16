import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class jungol138 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        for(int i = 1; i<=num; i++) {
            for(int j = 1; j<=num; j++) {
                System.out.printf("(%d, %d) ", i, j);
            }
            System.out.println();
        }
    }
}
