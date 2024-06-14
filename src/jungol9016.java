import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class jungol9016 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.printf("키를 입력하세요. ");
        int height = Integer.parseInt(br.readLine());
        System.out.printf("몸무게를 입력하세요. ");
        double weight = Double.parseDouble(br.readLine());
        System.out.printf("이름을 입력하세요. ");
        String name = br.readLine();
        System.out.printf("\n키 = %d\n", height);
        System.out.printf("몸무게 = %.2f\n", weight);
        System.out.printf("이름을 = %s", name);
    }
}
