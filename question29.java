import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class question29 {
    public static void main(String[] args) throws IOException {
        float a[] = new float[10];
        float b[] = new float[10];
        Arrays.fill(a, 10);
        Arrays.fill(b, (float) 10.2);
        System.out.println("Both Arrays are equal ?? " + Arrays.equals(a, b));
        Arrays.fill(b, 10);
        System.out.println("Both Arrays are equal ?? " + Arrays.equals(a, b));
    }
}
