import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class jungol531 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(br.readLine());
        if (weight <= 50.80){
            System.out.println("Flyweight");
        } else if(weight <= 61.23){
            System.out.println("Lightweight");
        } else if (weight <= 72.57) {
            System.out.println("Middleweight");
        } else if (weight <= 88.45) {
            System.out.println("Cruiserweight");
        } else if (weight > 88.45) {
            System.out.println("Heavyweight");
        }
    }
}
