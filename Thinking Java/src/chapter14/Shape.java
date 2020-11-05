package chapter14;

public abstract class Shape {
    public void draw(){
        System.out.println(this + ".draw()");
    }
    abstract public String toString();
    public void rotate(double d){
        if (this.getClass() != Circle.class){
            System.out.println("I rotated this " + this);
        }
        else{
            System.out.println("This is Circle, I won't rotate it");
        }
    }

}
