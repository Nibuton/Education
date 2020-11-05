import java.io.*;

public class LineDelimiter {
    public static void main(String[] args) throws IOException {
        byte[] data = {65,13,10,13,10,13};
        ByteArrayInputStream inputStream = new ByteArrayInputStream(data);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream(16);
        changeDelimiter(inputStream, outputStream); // здесь ваша функция
        byte [] out = outputStream.toByteArray();
        for (byte b : out){
            System.out.println(b);
        }
        // changeDelimiter(System.in,System.out);
    }

    public static void changeDelimiter(InputStream inputStream, OutputStream outputStream) throws IOException{
        int prev = inputStream.read();
        int curr = 0;
        while (prev != -1){
            curr = inputStream.read();
            if (!(prev == 13 && curr == 10)){
                outputStream.write(prev);
            }
            prev = curr;
        }
        outputStream.flush();
    }
}
