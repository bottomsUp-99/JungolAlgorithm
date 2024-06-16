import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class jungol141 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int i=2;
        int sum = 0;
        System.out.printf("%d ",num);
        while(true)
        {
            sum = num*i;
            if(sum >= 100)
                break;
            System.out.printf("%d ",sum);
            if(sum % 10 ==0)
                break;
            i++;
        }
    }
}
