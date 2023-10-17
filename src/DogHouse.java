import java.util.ArrayList;

public class DogHouse {

    public static int dogs_count = 0;
    public static ArrayList<Dog> dogs = new ArrayList<Dog>();

    public static void addDog(Dog puppy){
        dogs.add(puppy);
        dogs_count+=1;
    }

    public static void main(String[] args) {
        Dog waw = new Dog("Shura", 3);
        Dog waw1 = new Dog("Pip", 7);
        Dog waw2 = new Dog("Pop", 9);
        addDog(waw);
        addDog(waw1);
        addDog(waw2);
        System.out.println(dogs);
    }


}
