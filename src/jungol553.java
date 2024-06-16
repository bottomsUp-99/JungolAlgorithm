import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class jungol553 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int row = Integer.parseInt(br.readLine());
        char c = 'A';
        for (int i = 0; i < row; i++) {
            for (int j = row; i < j; j--) {
                System.out.printf("%c", c++);
            }
            System.out.println();
        }
    }
}
