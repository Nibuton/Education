public class Regular {
    public static void main(String[] args) {

        String s1 = "74954420366";
        System.out.println(s1.matches("\\+?[78](-?\\d){10}"));
    }
}