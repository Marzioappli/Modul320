package K04;

public class Film {
    public Genre genre;
    public Drehort drehort;
    public Requisiten requisiten;
    public Actor actor;

    public Film(Actor actor, Genre genre){
        this.drehort = new Drehort();
        this.requisiten = new Requisiten(); //Instanz
        this.genre = genre;
        this.actor = actor;
    }
}

