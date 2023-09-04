public class Main {
    public static void main(String[] args) {
        Owner elephantOwner = new Owner("Michael Meier", 27, "Am Waldweg 3, 09113 Chemnitz");
        Species elephant = new Species("elephant", 150000);
        Animal fanti = new Animal(1, "Fanti", elephant, 3, elephantOwner);
        Animal anotherFanti = new Animal(1, "Fanti", elephant, 3, elephantOwner);
        System.out.println(elephant);
        System.out.println(fanti.equals(anotherFanti));

    }
}
