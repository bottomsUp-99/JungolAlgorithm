import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class jungol516 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double a = Double.parseDouble(br.readLine());
        double b = Double.parseDouble(br.readLine());
        String l = br.readLine();
        System.out.printf("%.2f\n", a);
        System.out.printf("%.2f\n", b);
        System.out.printf("%s", l);
    }
}