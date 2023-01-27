package K04;

public class Main {
    public static void main() {
        Actor marzio = new Actor();
        Genre horror = new Genre();
        Film film = new Film(marzio, horror);
    }
}
