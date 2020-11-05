package Chapter_3;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        Beverage beverage = new Espresso();
        beverage = new Cream(new Cream(new Choco(beverage)));
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());
        int c;

        try(OutputStreamWriter outputStreamWriter = new FileWriter(new File("Love.txt"))){
            outputStreamWriter.write("i love Katya so much");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(InputStream in = new UpperCaseInputStream(new BufferedInputStream(new FileInputStream("Love.txt")))) {
            while((c = in.read()) >= 0){
                System.out.print((char) c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
