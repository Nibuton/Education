package butov.nikita;

import java.util.Random;

public class RandomElement {
    public static void main(String[] args) {
        int l = 0;
        int r = 18;
        Random random = new Random();
        int ra = random.nextInt(r + 1);
        for (int i = 0; i < 10; i++)
            System.out.println(ra);
    }
}
