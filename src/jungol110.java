import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class jungol110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("yard? ");
        double yard = Double.parseDouble(br.readLine());
        System.out.printf("%.1fyard = %.1fcm", yard, yard * 91.44);
    }
}
