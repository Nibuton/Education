public class AnimalsConstructor {
    public static void main(String[] args) {
        Dog d = new Dog("Bobik",11, "black");
        Cat c = new Cat("Barsik",3, "red");
        d.setName("Hannibal"); // меняем объекту поле имя
        d.getName(); // убедимся, что оно поменялось
        d.Jump(10);
        d.Run(100);
        d.Swim(10000); // на такую длину и высоту при незаданных при создании ограничениях, собака
                             // не может прыгнуть или плыть
        d.setMax_height(15); // поменяем ограничение
        System.out.println(d.getMax_height()); // посмотрим, изменилось ли оно
        d.Jump(10); // попробуем снова прыгнуть на такую высоту
        c.getGeneralInfo(); // объект кошка с полями заполненными автоматически. Дальше поменяем объекту поля.
        c.setName("Kot");
        c.setColor("brown");
        c.setAge(11);
        c.getGeneralInfo(); // проверяем, что поля объекта поменялись
        c.Swim(10); // проверяем, что кошка не плавает
    }
}
