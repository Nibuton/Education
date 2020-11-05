public class Employee {
    private String name;
    private String position;
    private String email;
    private String telephone;
    private int salary;
    private int age;

    public Employee(){
        name = "Alexey Nikolaevich Ivanov";
        position = "Head of the company";
        email = "ani@mail.ru";
        telephone = "+0-000-000";
        salary = 1000000;
        age = 51;
    }

    public Employee(String name, String position, String email, String telephone, int salary, int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    public void getInfo(){
        System.out.println(name + " " + position + " " + email + telephone + " " + salary + " " + age);
    }

    public int getAge(){
        return age;
    }
}

