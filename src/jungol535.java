import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class jungol535 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double grade = Double.parseDouble(br.readLine());
        switch ((int) grade) {
            case 4:
                System.out.println("scholarship");
                break;
            case 3:
                System.out.println("next semester");
                break;
            case 2:
                System.out.println("seasonal semester");
                break;

            default:
                System.out.println("retake");
                break;
        }
    }
}
