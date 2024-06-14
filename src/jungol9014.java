import java.io.*;

public class jungol9014 {
    public static void main(String[] args) throws IOException {
        System.out.printf("당신의 나이는 몇 살입니까? ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int age = Integer.parseInt(br.readLine());
        System.out.println("당신의 나이는 " + age + "이군요.");
    }
}
