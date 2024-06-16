import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class jungol123 {
    public static void main(String[] args) throws IOException {
        System.out.printf("Number? ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        switch (a) {
            case 1:
                System.out.println("dog");
                break;
            case 2:
                System.out.println("cat");
                break;
            case 3:
                System.out.println("chick");
                break;

            default:
                System.out.println("I don't know.");
                break;
        }
    }
}
