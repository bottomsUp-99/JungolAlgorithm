import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class jungol128 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0;
        while (true){
            int num  = Integer.parseInt(st.nextToken());
            if (num == 0) break;
            if ((num % 3 != 0) && (num % 5 != 0)){
                count++;
            }
        }
        System.out.println(count);
    }
}
