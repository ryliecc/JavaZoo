public class Main {
    public static void main(String[] args) {
        Animal elephant = new Animal(1, "Fanti", "elephant", 3);
        Animal anotherElephant = new Animal(1, "Fanti", "elephant", 3);
        System.out.println(elephant);
        System.out.println(elephant.equals(anotherElephant));

    }
}
