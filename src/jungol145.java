import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class jungol145 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < (num - i) - 1; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print((k + 1) + " ");
            }
            System.out.println();
        }
    }
}