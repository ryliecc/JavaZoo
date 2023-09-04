import java.util.List;

public record Zoo(List<Animal> allAnimals) {
    double amountFoodNeeded(){
        double amountFood = 0;
        for(int i = 0; i < allAnimals.size(); i++){
            Animal currentAnimal = allAnimals.get(i);
            Species currentSpecies = currentAnimal.species();
            amountFood = amountFood + currentSpecies.dailyFoodAmount();
        }
        return amountFood;
    }
}
