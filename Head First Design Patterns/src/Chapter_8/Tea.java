package Chapter_8;

public class Tea extends HotBevearage{
    @Override
    void addCondiments() {
        System.out.println("Adding lemon...\nAdding sugar...");
    }

    @Override
    protected boolean condiments() {
        return true;
    }
}
