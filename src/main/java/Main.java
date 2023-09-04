public class Main {
    public static void main(String[] args) {
        Owner elephantOwner = new Owner("Michael Meier", 27, "Am Waldweg 3, 09113 Chemnitz");
        Animal elephant = new Animal(1, "Fanti", "elephant", 3, elephantOwner);
        Animal anotherElephant = new Animal(1, "Fanti", "elephant", 3, elephantOwner);
        System.out.println(elephant);
        System.out.println(elephant.equals(anotherElephant));

    }
}
