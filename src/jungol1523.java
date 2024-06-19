import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class jungol1523 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        if ((n > 100 || n < 1) || (m > 3 || m < 1)) {
            System.out.println("INPUT ERROR!");
        } else {
            if (m == 1) {
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            } else if (m == 2) {
                for (int i = 0; i < n; i++) {
                    for (int j = i; j < n; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            } else if (m == 3) {
                for (int i = 1; i <= n; i++) {
                    for (int j = n; j > i; j--) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= (2 * i - 1); k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        }
    }
}