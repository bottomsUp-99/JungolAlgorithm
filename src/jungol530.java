import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class jungol530 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int age = Integer.parseInt(br.readLine());
        if (age >= 20){
            System.out.println("adult");
        } else {
            System.out.println(20 - age + " years later");
        }
    }
}
