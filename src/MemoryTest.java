import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MemoryTest {
    public static void main(String[] args) throws IOException {
        // Measure memory usage for BufferedReader created outside the loop
        long memoryBefore = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            String input = br.readLine();
        }
        long memoryAfter = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("Memory used (outside loop): " + (memoryAfter - memoryBefore) + " bytes");

        // Measure memory usage for BufferedReader created inside the loop
        memoryBefore = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        for (int i = 0; i < 10; i++) {
            BufferedReader brInside = new BufferedReader(new InputStreamReader(System.in));
            String input = brInside.readLine();
        }
        memoryAfter = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("Memory used (inside loop): " + (memoryAfter - memoryBefore) + " bytes");
    }
}