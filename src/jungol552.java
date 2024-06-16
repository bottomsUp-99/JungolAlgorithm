import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class jungol552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int row = 2 * n - 1;
        for (int i = row; i >= 1; i -= 2) {
            int empty = (row - i) / 2;
            for (int j = 1; j <= empty; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
