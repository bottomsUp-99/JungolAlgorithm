import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class jungol514 {
    public static void main(String[] args) throws IOException {
        System.out.printf("height = ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int height = Integer.parseInt(br.readLine());
        System.out.println("Your height is " + height + "cm.");
    }
}
