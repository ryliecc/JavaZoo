import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Owner elephantOwner = new Owner("Michael Meier", 27, "Am Waldweg 3, 09113 Chemnitz");
        Owner fishOwner = new Owner("Sandra Schmidt", 39, "Hubertushöhe 6, 01836 Dingsstadt");

        Species elephant = new Species("elephant", 150000);
        Species dolphin = new Species("dolphin", 8000);
        Species koi = new Species("koi", 20);

        Animal fanti = new Animal(1, "Fanti", elephant, 3, elephantOwner);
        Animal anotherFanti = new Animal(1, "Fanti", elephant, 3, elephantOwner);

        Animal flipper = new Animal(2, "Flipper", dolphin, 4, fishOwner);
        Animal twinkle = new Animal(3, "Twinkle", koi, 2, fishOwner);

        System.out.println(elephant);
        System.out.println("Fanti equals another Fanti: " + fanti.equals(anotherFanti));

        anotherFanti = anotherFanti.withId(4);
        System.out.println("Fanti equals another Fanti: " + fanti.equals(anotherFanti));

        List<Animal> allAnimals = new ArrayList<>();
        allAnimals.add(fanti);
        allAnimals.add(anotherFanti);
        allAnimals.add(flipper);
        allAnimals.add(twinkle);

        Zoo zoo = new Zoo(allAnimals);
        double amountFoodNeeded = zoo.amountFoodNeeded();
        System.out.println(amountFoodNeeded);

    }
}
