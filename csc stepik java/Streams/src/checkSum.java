import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class checkSum {

    public static void main(String[] args) throws IOException {
        byte[] data = {0x33, 0x45, 0x01};
        InputStream inputStream = new ByteArrayInputStream(data);
        System.out.println(checkSumOfStream(inputStream));
    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        int sum = 0;
        int n = inputStream.read();
        while(n != -1){
            sum = Integer.rotateLeft(sum,1) ^ n;
            n = inputStream.read();
        }
        return sum;
    }
}


