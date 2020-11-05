import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {
    public static void main(String[] args) throws IOException {

        /* byte[] data = {123,10,111,10};
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(100);
        byteArrayOutputStream.write(data);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(byteArrayOutputStream, charset); */

        /* Charset charset = StandardCharsets.UTF_8;
        String s = "Ы";
        byte[] b = s.getBytes(charset);
        for (byte a : b){
            System.out.println(Byte.toUnsignedInt(a)); */
        Path path = Paths.get("/home/nibuton/a.txt");
        Files.deleteIfExists(path);
        Files.createFile(path);
        OutputStream outputStream = Files.newOutputStream(path);
        try(Writer writer = new OutputStreamWriter(outputStream, StandardCharsets.US_ASCII)) {
            writer.write('а');
        }
    }
}
