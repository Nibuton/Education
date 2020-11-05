import java.io.*;

public class deSerialize {
    public static void main(String[] args) throws IOException {
        Animal[] animalM1 = { new Animal("Cat"), new Animal("Dog"), new Animal("Elephant"),
                new Animal("Cock"), new Animal("Bull"), new Animal("Ant"),
                new Animal("Tentecles"), new Animal("Worm")};
        ByteArrayOutputStream bai = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bai);
        oos.writeInt(animalM1.length);
        for (int i = 0; i < animalM1.length; i++) {
            oos.writeObject(animalM1[i]);
        }
        oos.flush();
        oos.close();
        Animal[] animalM2 = deserializeAnimalArray(bai.toByteArray());
        for (int i = 0; i < animalM2.length; i++) {
            System.out.printf("%d. %s \n", i+1, animalM2[i].getName());
        }


    }

    public static Animal[] deserializeAnimalArray(byte[] data){
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(data);
        try(ObjectInputStream ois = new ObjectInputStream(byteArrayInputStream)){
            int n = ois.readInt();
            Animal[] animals = new Animal[n];
            for (int i = 0; i < n; i++){
                animals[i] = (Animal) ois.readObject();
            }
            return animals;
        } catch (Exception e) {
            throw new java.lang.IllegalArgumentException();
        }
    }

}
