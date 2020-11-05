package Chapter_3;
public abstract class Beverage {

    String description = "Unknown";
    public enum Size { BIG, MEDIUM, SMALL};
    Size size = Size.MEDIUM;

    public String getDescription(){ return description; }
    public void setSize(Size size){ this.size = size; }
    public Size getSize(){ return size; }

    public abstract double cost();

}
