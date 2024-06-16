import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class jungol543 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        for (int i = 1 ; i < a + 1 ; i++){
            if (i % 2 == 0) System.out.printf(i + " ");
        }
    }
}
