import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class jungol143 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int row = 2 * num - 1;

        for (int i = row; i >= 1; i -= 2) {
            int empty = (row - i) / 2;
            for (int j = 0; j < empty; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 3; i <= row; i += 2) {
            int spaces = (row - i) / 2;
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
