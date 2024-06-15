import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class jungol529 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int height = Integer.parseInt(st.nextToken());
        int weight = Integer.parseInt(st.nextToken());
        int result = calculate(height, weight);
        System.out.println(result);
        if (result > 0){
            System.out.println("Obesity");
        }
    }
    public static int calculate(int h, int w){
        int bmi = w + 100 - h;
        return bmi;
    }
}
