import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class jungol54 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int tmp1 = 1;
        char tmp2 = 'A';
        for(int i = 0 ; i < n ; i++){
            for(int j = 1 ; j <= n - i ; j++){
                System.out.printf("%d ",tmp1++);
            }
            for(int j = 1 ; j <= i + 1 ; j++){
                System.out.printf("%c ",tmp2++);
            }
            System.out.println();
        }
    }
}
