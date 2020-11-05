import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class castBytesToString {
    public static void main(String[] args) throws IOException{

        byte[] data = {48, 49, 50, 51};
        ByteArrayInputStream inputStream = new ByteArrayInputStream(data);

        String s = readAsString(inputStream, StandardCharsets.US_ASCII);
        System.out.println(s);
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {

        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, charset);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        StringWriter stringWriter = new StringWriter();

        int tmp;
        while((tmp = bufferedReader.read()) != -1){
            stringWriter.write(tmp);
        }
        stringWriter.flush();
        return stringWriter.toString();
    }
}
