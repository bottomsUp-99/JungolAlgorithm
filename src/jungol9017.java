import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class jungol9017 {
    public static void main(String[] args) throws IOException {
        System.out.println("두 개의 실수를 입력하시오.");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double a = Double.parseDouble(br.readLine());
        double b = Double.parseDouble(br.readLine());
        System.out.printf("x = %.2f\n", a);
        System.out.printf("y = %.2f", b);
    }
}