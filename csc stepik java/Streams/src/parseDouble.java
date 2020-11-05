import java.io.*;

public class parseDouble {
    public static void main(String[] args) throws IOException {
        // ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream("-1e3\n18 .111 11bbb".getBytes());
        // System.setIn(byteArrayInputStream);
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String s;
        String [] tmp;
        double sum = 0;
        double d = 0;
        while( (s = bufferedReader.readLine()) != null){
            tmp = s.split(" ");
            for (String one : tmp){
                try{
                    d = Double.parseDouble(one);
                    sum += d;
                }
                catch (NumberFormatException e){
                    continue;
                }
            }
        }
        System.out.print(String.format("%.6f", sum));
    }
}
