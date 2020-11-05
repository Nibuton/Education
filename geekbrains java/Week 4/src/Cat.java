public class Cat extends Animal {

    public Cat(String name, int age, String color){
        super(name, age, color);
        max_height = 2;
        max_length_run = 200;
    }

    public void Swim(float length){
        System.out.println(name + " can't swim. It's a cat");
    }
}
