package K05;

public class Lehrperson {
    public final String name;
    public final String geschlecht;
    public final String fach;

    public Lehrperson(String name, String geschlecht, String fach) {
        this.name = name;
        this.geschlecht = geschlecht;
        this.fach = fach;
    }
    public String sayHi(){
        return "Hallo";
    }
}
