package Chapter_8;

public class Main {
    public static void main(String[] args) {
        HotBevearage coffee = new Coffee();
        coffee.prepareBevereage();
        System.out.println("-----------NEW------------");
        HotBevearage tea = new Tea();
        tea.prepareBevereage();
    }
}
